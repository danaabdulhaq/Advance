public class WindSpeedDecorator extends TemperatureUnitsDecorator {



  private int windSpeed;


    public WindSpeedDecorator(){
        windSpeed = 0;
    }

    public WindSpeedDecorator(int windSpeed){
        this.windSpeed=windSpeed;

    }



    @Override
    public void Display() {
        super.Display();
        getWindStatus();
    }


    public void getWindStatus() {

        boolean isHighWind = false;
        String windStatus = "";

        do {
            if (windSpeed >= 118 && windSpeed <= 133) {
                windStatus = "Slow winds";
                isHighWind = true;
            } else if (windSpeed >= 134 && windSpeed <= 154) {
                windStatus = "Moderate winds";
                isHighWind = true;
            } else if (windSpeed >= 155 && windSpeed <= 177) {
                windStatus = "Strong wind";
                isHighWind = true;
            } else if (windSpeed >= 178 && windSpeed <= 209) {
                windStatus = " Very strong winds ";
                isHighWind = true;
            } else if (windSpeed >= 210) {
                windStatus = "Storm ";
                isHighWind = true;
            } else {
                windStatus = "Wind speed is not high enough to cause damage";
                isHighWind = false;
            }
        } while (isHighWind == false);

        System.out.println(windStatus);

    }
}

