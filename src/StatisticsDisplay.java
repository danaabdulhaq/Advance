import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements WeatherDataObserver{

private List<Integer> temp , hum ;

    public StatisticsDisplay(WeatherDataSubject Weather){
        temp = new ArrayList<>();
        hum = new ArrayList<>();
        Weather.RegisterCurrentWeather(this);

    }
    @Override
    public void update(int temp, int hum) {
        this.temp.add(temp);
        this.hum.add(hum);
        Display();
    }

    @Override
    public void Display() {
        float sum1 = 0;
        float sum2 = 0;

        float AvgTemp , Avghum ;

        for (int x : temp){
            sum1 += x;
        }
        AvgTemp = sum1/temp.size();
        System.out.println("Average temperature : "+ AvgTemp);
        for (int x : hum){
            sum2 += x;
        }
        Avghum = sum2/hum.size();
        System.out.println("Average humidity " + Avghum);
    }


}
