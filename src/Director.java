import java.util.ArrayList;

public class Director extends UserInfo {
        private ArrayList<Manager> managers;
        private ArrayList<Staff> staff;

        public Director(int id , int age , String name , int total ,int hourly){
        super(id , name ,age , total , hourly);
        managers = new ArrayList<>();
        staff = new ArrayList<>();
        }

        public ArrayList<Manager> getManagers(){
            return managers;
        }

        public ArrayList<Staff> getStaff(){
            return staff;
        }

        public void  EnrollManager(Manager manager ){
           this.managers.add(manager);
        }
        public void EnrollStaff(Staff stuff){
            this.staff.add(stuff);
        }



}
