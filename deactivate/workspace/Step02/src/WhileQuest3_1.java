import java.util.Scanner;

public class WhileQuest3_1 {


    // n 부터 k 까지 숫자의 합을 구하시오

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int n, k;

        System.out.print("n : ");
        n = scan.nextInt();

        System.out.print("k : ");
        k = scan.nextInt();


        int sum = 0;

        while (n <= k) {
            sum += n;
            n++ ;
        }

        System.out.println(sum);


    }
}
