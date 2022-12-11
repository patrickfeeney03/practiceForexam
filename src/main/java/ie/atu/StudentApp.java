package ie.atu;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        String temp_name;
        String temp_email;
        String temp_course;
        Scanner userInput = new Scanner(System.in);
        Student stu1 = new Student();
        System.out.println("Please enter the first student name: ");
        temp_name = userInput.nextLine();
        System.out.println("Please enter the first email: ");
        temp_email = userInput.nextLine();
        System.out.println("Please enter the first course: ");
        temp_course = userInput.nextLine();
        stu1.setName(temp_name);
        stu1.setEmail(temp_email);
        stu1.setCourse(temp_course);





    }
}