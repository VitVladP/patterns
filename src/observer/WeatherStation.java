package observer;

import observer.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(30,65,28);
        Thread.sleep(1000);
        weatherData.setMeasurements(35,40,40);
        Thread.sleep(1000);
        weatherData.setMeasurements(28,58,50);
    }
}
