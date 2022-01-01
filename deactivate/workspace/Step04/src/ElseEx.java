import java.util.Scanner;

public class ElseEx {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 입력 : ");

        int n = scan.nextInt();


        if (n % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수 입니다.");


        } else {
            System.out.println("입력하신 숫자는 홀수 입니다. ");

        }


    }
}
