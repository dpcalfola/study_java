import java.util.Scanner;

public class IfEx2 {

    /*
     * 숫자 두개를 입력 받아서
     * 작은 숫자부터 큰 숫자까지 합을 출력
     *
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

//        int min = Math.min(a,b);
//        int max = Math.max(a,b);


        int min, max;
        if (a > b) {
            max = a;
            min = b;
        } else {
            min = a;
            max = b;

        }

        int sum = 0;


        for (int i = min; i <= max; i++) {

            sum += i;

        }

        System.out.println(sum);


    }
}
