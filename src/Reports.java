import java.util.ArrayList;
import java.util.List;

public class Reports {

    public ArrayList<UserInfo> ListOfStaff_Report(UserInfo user) {
        ArrayList<UserInfo> staffList = new ArrayList<>();
        if (user instanceof Director) {
            List<Manager> managers = ((Director) user).getManagers();
            for (Manager manager : managers) {
                staffList.addAll(manager.getStaffs());
            }
        } else if (user instanceof Manager) {
            staffList.addAll(((Manager) user).getStaffs());
        }
        return staffList;

    }

    public int CalculateBudget(UserInfo user) {
        return user.getTotal_Hours()* user.getHourly_Rate();
    }

}