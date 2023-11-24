public class TemperatureUnitsDecorator implements WeatherDataObserver {

     private WeatherDataObserver Observar;
     private WeatherDataSubject weather;


    public TemperatureUnitsDecorator(){
    }


        public TemperatureUnitsDecorator(WeatherDataObserver observar , WeatherDataSubject weather)
        {
            this.Observar=observar;
            this.weather=weather;

        }

    @Override
    public void update(int temp, int hum) {
        this.Observar.update(temp,hum);
    }

    @Override
    public void Display() {
        this.Observar.Display()  ;
          changeFromCtoF();

    }


    public void changeFromCtoF(){
         int tem = weather.getTemperature();
         System.out.println(" Temperature from Celsius to Fahrenheit : " + 32+9 * tem/5);
    }
}
