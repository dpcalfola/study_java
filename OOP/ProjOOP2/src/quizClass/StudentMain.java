package quizClass;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {

        //선언부
        Student stu1 = new Student();

        //입력부
        Scanner scan = new Scanner(System.in);
        stu1.setName(scan.next());
        stu1.setSchool(scan.next());
        stu1.setGrade(scan.next());
        scan.close();

        //출력부
        System.out.printf("Name : %s\n", stu1.getName());
        System.out.printf("School : %s\n", stu1.getSchool());
        System.out.printf("Grade : %s\n", stu1.getGrade());
    }
}
