import java.util.Scanner;

public class ElseIfEx {

    /*
     *
     *
     *
     * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 입력 : ");
        int a = scan.nextInt();


        if (a == 0) {
            System.out.println("입력하신 숫자는 0입니다");
        } else if ( a %2 == 0) {
            System.out.println("입력하신 숫자는 짝수 입니다.");
        } else {
            System.out.println("입력하신 숫자는 홀수 입니다.");
        }


    }
}
