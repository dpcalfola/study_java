package quiz6th;

import java.util.Scanner;

public class FirstQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SchoolClass jeju = new SchoolClass("Jejuelementary", 6);
        SchoolClass anotherSchool = new SchoolClass(scan.next(), scan.nextInt());

        System.out.printf("%d grade in %s\n", jeju.getSchoolGrade(), jeju.getSchoolName());
        System.out.printf("%d grade in %s\n", anotherSchool.getSchoolGrade(), anotherSchool.getSchoolName());
    }
}

class SchoolClass {
    private String schoolName;
    private int schoolGrade;

    public SchoolClass(String schoolName, int schoolGrade) {
        this.schoolName = schoolName;
        this.schoolGrade = schoolGrade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getSchoolGrade() {
        return schoolGrade;
    }
}