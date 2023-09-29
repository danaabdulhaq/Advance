


package first.app.test;


public class FirstAppTest {

    public static void main(String[] args) {

      
   
        
	Course c1 = new Course(1, "101", "hamed", 15);
        Course c2 = new Course(2, "102", "lara", 10);
        Course c3 = new Course(3, "100", "farah", 20);
        
        Student s1 = new Student(10, "dana", "dana@example.com");
        Student  s2= new Student(20, "ghina", "ghina@example.com");
        Student s3 = new Student(30, "hasan", "hasan@example.com");

        University university = new University();
        university.addStudents(s1);
        university.addStudents(s2);
        university.addStudents(s3);

        university.addCourses(c1);
        university.addCourses(c3);
        university.addCourses(c1);

        university.enrollStudent(s2, c1);
        university.enrollStudent(s3, c3);
        university.enrollStudent(s1, c1);
        university.AllReports(s2, c1);
        
        
        university.availabelCourses_Report();
        




    }
    
}
