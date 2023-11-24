import java.util.ArrayList;
import java.util.List;



public class WeatherDataSubject {

    private int temperature , humidity ;
    private List<WeatherDataObserver> observer ;


    public WeatherDataSubject(){this.observer = new ArrayList<>();}

    public void RegisterCurrentWeather(WeatherDataObserver o){
        observer.add(o);
    }


    public void NotifyObservers(){
        observer.forEach(o->o.update(temperature,humidity));
    }

    public void changeWeather(int temp , int hum){
        temperature = temp;
        humidity = hum;
        NotifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }


    public void removeObserver(WeatherDataObserver O){
        int Obse = observer.indexOf(O);
        if(Obse >= 0){
            observer.remove(Obse);
        }
    }
}
