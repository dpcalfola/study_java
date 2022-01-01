import java.util.Scanner;

public class ForEx {

    /*
     * 숫자 하나 입력 받아서
     * 입력한 숫자의 팩토리얼 값을 출력하시오.
     *
     * */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("팩토리얼 : 숫자를 입력하세요 : ");

        int n = scan.nextInt();
        Long fac = 1L;

        for (int i = 1; i <= n; i++) {
            fac *= i;
        }

        System.out.println(fac);
        System.out.println(Long.MAX_VALUE);


        /// Long 변수로는 20! 까지가 한계

    }
}
