import java.util.Scanner;

public class ForSumExample2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inpNum = scan.nextInt();
        scan.close();

        int sum = 0 ;

        for (int i = 1; i <= inpNum ; i++) {
            sum += i ;
        }

        System.out.println("sum = " + sum);

    }
}
