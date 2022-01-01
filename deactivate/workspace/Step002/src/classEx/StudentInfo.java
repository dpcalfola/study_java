package classEx;

public class StudentInfo {

    String studentNum;
    String name;
    String major;
    double avgScore;
    String grade;

    StudentInfo(){
    }


    StudentInfo(String a, String b, Double c) {
        studentNum = a;
        name = b;
        avgScore = c;

        if (c == 4.5) {
            grade = "A+";
        } else if (c >= 4.0 && c < 4.5) {
            grade = "A";
        } else if (c >= 3.5 && c < 4.0) {
            grade = "B+";
        } else if (c >= 3.0 && c < 3.5) {
            grade = "B";
        } else if (c >= 2.5 && c < 3.0) {
            grade = "C+";
        } else if (c >= 2.0 && c < 2.5) {
            grade = "C";
        } else if (c >= 1.5 && c < 2.0) {
            grade = "D";
        } else {
            grade = "F";
        }


    }


}
