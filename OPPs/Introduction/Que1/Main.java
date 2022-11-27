//  Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
// the value of roll_no as '2' and that of name as "John" by creating an object of the class Student

class Student{
    String name;
    int rollno;
}

public class Main{
    public static void main(String[] args) {
       Student std1 = new Student();
       std1.name = "Rohan";
       std1.rollno = 1;

       Student std2 = new Student();
       std2.name = "John";
       std2.rollno = 2;

       System.out.println(std2.name);
       System.out.println(std2.rollno);
    }
}