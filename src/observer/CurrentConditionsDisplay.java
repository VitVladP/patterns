package observer;

import observer.impl.WeatherData;
import observer.watherint.DisplayElement;
import observer.watherint.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \n" +
                            "   temperature: " + temperature +" C degree \n" +
                            "   humidity: " + humidity + "%"
        );
    }

    @Override
    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
        }
        display();
    }
}
