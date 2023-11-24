
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        WeatherDataSubject weather = new WeatherDataSubject();
        CurrentConditionsDisplay CurrentWeather = new CurrentConditionsDisplay(weather);
        StatisticsDisplay statisticsInfo = new StatisticsDisplay(weather);


        for(int i = 0 ; i<5 ; i++) {
            int randomTemp = getRandomnumber(-10, 40);
            int randomhum = getRandomnumber(0, 100);


            weather.changeWeather(randomTemp, randomhum);
        }


        System.out.println("-----------------------------------------------");



    }

    public static int getRandomnumber(int min , int max){
        Random num = new Random();
        return num.nextInt(max + 1-min )+min ;
    }
}

