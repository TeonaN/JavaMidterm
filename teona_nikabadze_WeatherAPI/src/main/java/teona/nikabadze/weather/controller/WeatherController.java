package teona.nikabadze.weather.controller;

import teona.nikabadze.weather.model.Weather;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weather")
public class WeatherController {

    public List<Weather> weatherList = new ArrayList<>();

    public WeatherController() {
        weatherList.add(new Weather("East",20,"Tbilisi",70,20,15));
        weatherList.add(new Weather("WEST",20,"Batumi",72,25,11));
        weatherList.add(new Weather("EAST",20,"Kutaisi",71,22,12));
    }



    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeather() {

        return weatherList;

    }



    @GET
    @Path("/{cityName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getData(@PathParam("cityName") String cityName){
        for (Weather i: weatherList){
            if (i.getCityName().equals(cityName)){
                return i;
            }
        }

        return null;


    }

}

