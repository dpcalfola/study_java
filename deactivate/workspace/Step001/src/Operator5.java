import java.util.Scanner;

public class Operator5 {

    /*
     * 논리연산자
     *
     * 정수형 변수 두개 선언 (n1, n2)
     * 숫자 두 개 입력 받은 후
     *
     * n1 이 5보다 크고, n2 는 10보다 작은지
     * n1 이 짝수고, n2는 10보다 크고, 15 보다 작은지
     *
     * 위의 두개 연산식을 작성하고 결과를 출력하시오
     *
     * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 두개를 입력하세요 : ");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println(n1 > 5 && n2 < 10);
        System.out.println(n1 % 2 == 0 && n2 > 10 && n2 < 15);


    }
}
