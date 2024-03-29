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

        System.out.println("Please enter the second student name: ");
        temp_name = userInput.nextLine();
        System.out.println("Please enter the second email: ");
        temp_email = userInput.nextLine();
        System.out.println("Please enter the second course: ");
        temp_course = userInput.nextLine();
        Student stu2 = new Student(temp_name);
        stu2.setEmail(temp_email);
        stu2.setCourse(temp_course);

        System.out.println("Please enter the third student name: ");
        temp_name = userInput.nextLine();
        System.out.println("Please enter the third email: ");
        temp_email = userInput.nextLine();
        System.out.println("Please enter the third course: ");
        temp_course = userInput.nextLine();
        Student stu3 = new Student(temp_name, temp_email, temp_course);

        System.out.println("Student1:\n" + stu1.getName() + "\n" + stu1.getEmail() + "\n" + stu1.getCourse() + "\n");
        System.out.println("Student2:\n" + stu2.getName() + "\n" + stu2.getEmail() + "\n" + stu2.getCourse() + "\n");
        System.out.println("Student2:\n" + stu3.getName() + "\n" + stu3.getEmail() + "\n" + stu3.getCourse() + "\n");
    }
}