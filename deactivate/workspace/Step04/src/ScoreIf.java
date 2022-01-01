import java.util.Scanner;

public class ScoreIf {
    /*
     * 점수 하나를 입력 받아서
     * 각 점수에 해당하는 성적 등급을 출력
     *
     * 100~90 : A
     * 89~80 : B
     * 79~70 : C
     * 60~69 : D
     * 59~0 : F
     *
     *
     * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("당신의 점수를 입력하세요 ");

        int scoreInt = scan.nextInt();
        scan.close();

        char scoreChar;

        if (scoreInt <= 59) scoreChar = 'F';
        else if (scoreInt <= 69) scoreChar = 'D';
        else if (scoreInt <= 79) scoreChar = 'C';
        else if (scoreInt <= 89) scoreChar = 'B';
        else scoreChar = 'A';

        System.out.println("\n당신의 성적은 " + scoreChar + " 입니다");


    }
}
