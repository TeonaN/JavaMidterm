package teona.nikabadze.weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatBotService {
    public static String answer(String question) {
        String result;

        switch (question) {
            case "All":
                result = "გამარჯობა, რითი შემიძლია დაგეხმაროთ?";
                break;
            case "რომელი საათია?":
                result = "10";
                break;
            default:
                result = "ამ კითხვაზე პასუხი არ მაქვს";
        }

        return result;
}



}