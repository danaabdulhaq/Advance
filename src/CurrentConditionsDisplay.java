import java.util.ArrayList;

public class CurrentConditionsDisplay implements WeatherDataObserver {

private int temperature ;
private int humidity ;

    public CurrentConditionsDisplay(WeatherDataSubject weather){
        weather.RegisterCurrentWeather(this);
    }

    @Override
    public void update(int temp, int hum) {
        temperature=temp;
        humidity=hum;
        Display();
    }

    @Override
    public void Display() {
        System.out.println("\ncurrent weather : " + " temperature :" + temperature + " humidity :" + humidity);
    }
}
