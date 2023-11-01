
public class UserInfo {

        private int ID ;
        private int Age;
        private int Total_Hours ;
        private String Name ;
        private int Hourly_Rate;


        public UserInfo(int id ,String name , int age , int total, int hourlyHours){
            ID = id ;
            Age = age;
            Name = name;
            Total_Hours = total ;
            Hourly_Rate = hourlyHours;

        }

        public int getAge(){
            return Age;
        }

        public int getID(){
            return ID;
        }
        public int getTotal_Hours(){
            return Total_Hours;
        }
        public int getHourly_Rate(){
            return Hourly_Rate;
        }
        public String getName(){
            return Name;
        }

        public void setID(int id) {
            ID = id;
        }

        public void setAge(int age) {
            Age = age;
        }

        public void setHourly_Rate(int hourly_Rate) {
            Hourly_Rate = hourly_Rate;
        }

        public void setName(String name) {
            Name = name;
        }

        public void setTotal_Hours(int total_Hours) {
            Total_Hours = total_Hours;
        }

}
