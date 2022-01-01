import java.util.Scanner;

public class IfEx1 {

    /*
     * if ===>>> 조건식이 true 일때 한 번 실행하는 문법
     *           false 이면 실행하지 않고 건너뜀
     *
     *
     * */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int n = scan.nextInt();

        scan.close();

        if (n % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수 입니다");
//        } else {
//            System.out.println("입력하신 숫자는 홀수 입니다");
//        }

        }

        if (n % 2 == 1) {
            System.out.println("입력하신 숫자는 홀수 입니다");
        }

    }
}
