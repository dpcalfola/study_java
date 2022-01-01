package classEx;

public class studentMain {

    public static void main(String[] args) {

        StudentInfo p1 = new StudentInfo();
        p1.studentNum = "A515176";
        p1.name = "Fola Folr";
        p1.major = "Psychology";
        p1.avgScore = 4.1;

        System.out.println("Student Number " + p1.studentNum);
        System.out.println("Name : " + p1.name);
        System.out.println("Major : " + p1.major);
        System.out.println("Average Score : " + p1.avgScore);
        System.out.println("grade : " + p1.grade);


        System.out.println("--------------------------");


        StudentInfo p2 = new StudentInfo("A515" , "Fola", 4.1 );

        System.out.println(p2.studentNum);
        System.out.println(p2.name);
        System.out.println(p2.avgScore);
        System.out.println(p2.grade);
    }
}
