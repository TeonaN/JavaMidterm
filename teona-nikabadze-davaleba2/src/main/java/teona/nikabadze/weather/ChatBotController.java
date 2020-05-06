package teona.nikabadze.weather;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@ServerEndpoint("/chat")
public class ChatBotController {

    public static String get() {
        try {
            URL url = new URL("http://localhost:8080/teona_nikabadze_WeatherAPI_war_exploded/api/weather/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server :  \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();

        }
        catch (Exception e){
            e.printStackTrace();
        }

        return "Error";

    }




    @OnOpen
    public void handleOpen() {
        System.out.println("Connected ...");
    }

    @OnMessage
    public String handleMessage(String message) {
        System.out.println("MSG From Client : " + message);
        String replayMessage = answer(message);
        System.out.println("MSG From Server : " + replayMessage);
        return replayMessage;
    }

    @OnClose
    public void handleClose() {
        System.out.println("End Connection ...");
    }

    @OnError
    public void handleError(Throwable t) {
        t.printStackTrace();
    }



    public static String answer(String question) {
        String result;

        switch (question) {
            case "all":
                result = get();
                break;
            default:
                result = "ამ კითხვაზე პასუხი არ მაქვს";
        }

        return result;
    }

}