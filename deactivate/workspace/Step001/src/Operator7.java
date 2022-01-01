import java.util.Scanner;

public class Operator7 {

    /*
    * 숫자 하나 입력 받아서
    * 숫자가 짝수면 짝수라고 홀수면 홀수라고 출력
    * 삼항연산자, String 변수타입 이용
    *
    * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");

        int n = scan.nextInt();

        String s = n%2 == 0 ? "짝수": "홀수";

        System.out.println(s);


    }
}
