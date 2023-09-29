# Advance
I built this code using the C++ language using oop, as I created a university registration system that helps students register for courses.
I created three classes, one for a student, the other for courses, and the last for the university.
For the student's class, I created variables that hold the student's data, and an object from the Courses class holds the courses in which the student registered. 
The class contains a constructor to fill in the value of the variables and a getter to retrieve the variables.
The course class contains variables that carry the course data and contains objects from the student class to register students and find out which students are registered in this course.
There is a function that registers students in the course and a function that cancels the student’s registration.
In the University class, I defined an Array of objects, one of the Student class and one of the Courses class. Then I created a function to add students and courses to the university.
Function works to register students in courses, 
as it takes two variables, the student number and course number, to register students in courses, 
and Function to delete them from courses, as it takes the student number and course number, searches for them, and calls the function to delete the student from Student Class and deletes it.
Finally, functions were created to display reports, and one of them displays all available courses, one displays all the courses in which the student is registered, 
the other displays the students registered in a specific course, and the last one only calls the reporting functions at once.
