public class PrecipitationDecorator extends WindSpeedDecorator {

     private String Precipitation;


    public PrecipitationDecorator() {

    }

    public PrecipitationDecorator(String X){
        Precipitation = X;
    }

    @Override
    public void Display() {
        super.Display();
        FallingCondition();

    }

   public void FallingCondition(){

        System.out.print("Weather and precipitation conditions\n" + Precipitation);
    }


}
