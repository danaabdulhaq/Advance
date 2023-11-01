import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Director director = new Director(1, 30, "dana (Director)", 100, 70);
        Manager manager1 = new Manager(2, 25, "ali", 130, 50);
        Manager manager2 = new Manager(3, 29, "Ghina", 90, 50);
        Staff staff1 = new Staff(4, 20, "hasan", 160, 30);
        Staff staff2 = new Staff(5, 27, "lara", 120, 35);
        Staff staff3 = new Staff(6, 36, "salim", 150, 38);



        manager1.EnrollStaff(staff1);
        manager1.EnrollStaff(staff2);
        manager2.EnrollStaff(staff3);
        director.EnrollManager(manager1);
        director.EnrollManager(manager2);



        Fake_Database fakeData = new Fake_Database();
        Reports reports = new Reports();

        fakeData.Add(director);
        fakeData.Add(manager1);
        fakeData.Add(manager2);
        fakeData.Add(staff1);
        fakeData.Add(staff2);
        fakeData.Add(staff3);


        Connect managerConnection = fakeData.OpenConnect(manager1);

        ArrayList<UserInfo> staffReport = reports.ListOfStaff_Report(manager1);
        System.out.println("A list of staff for Manager :");
        for (UserInfo employee : staffReport) {
            System.out.println("ID: " + employee.getID() + ", Name: " + employee.getName());
        }

        System.out.println("Manager's Budget:" + reports.CalculateBudget(manager1));


    }
}