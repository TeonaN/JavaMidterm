package teona.nikabadze.weather.model;

import teona.nikabadze.weather.controller.DirectionType;

public class Weather {

    //DirectionType windDirection;
    String windDirection;
    int windSpeed;
    String cityName;
    int pressure;
    int temperature;
    int humidity;



    public Weather(){

    }

    public Weather(String windDirection, int windSpeed, String cityName, int pressure, int temperature, int humidity) {
        //this.windDirection = windDirection;
        this.windDirection=windDirection;
        this.windSpeed = windSpeed;
        this.cityName = cityName;
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
    }


    public String getDirection() {
        return windDirection;
    }

    public void setDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "windDirection='" + windDirection + '\'' +
                ", windSpeed=" + windSpeed +
                ", cityName='" + cityName + '\'' +
                ", pressure=" + pressure +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

//    City Name - ქალაქი
//    Temperature - ტემპერატურა
//    Humidity - ნესტიანობა
//    Pressure - წნევა
//    Wind Direction - ქარის მიმართულება (DirectionType -ის )
//    Wind Speed - ქარის სიჩქარე
}
