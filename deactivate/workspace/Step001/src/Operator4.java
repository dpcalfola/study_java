import java.util.Scanner;

public class Operator4 {

    /*
     * 정수형 변수 두개 선언
     * 숫자 두개 입력 받은 후
     * 모든 관계연산자를 수행하고 결과 출력
     *
     * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 두 개를 입력하세요 : ");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();


        System.out.println("n1 == n2 " + (n1 == n2));
        System.out.println("n1 != n2 " + (n1 != n2));
        System.out.println("n1 > n2 " + (n1 > n2));
        System.out.println("n1 >= n2 " + (n1 >= n2));
        System.out.println("n1 < n2 " + (n1 < n2));
        System.out.println("n1 <= n2 " + (n1 <= n2));


    }
}
