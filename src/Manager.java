import java.util.ArrayList;

public class Manager extends UserInfo{

        private ArrayList<Staff> staffs;

        public Manager(int id , int age , String name , int total ,int hourly) {
            super(id, name, age, total, hourly);
            staffs = new ArrayList<>();

        }
        public ArrayList<Staff> getStaffs(){
            return staffs;
        }

        public void EnrollStaff(Staff staff){
            this.staffs.add(staff);
        }


}
