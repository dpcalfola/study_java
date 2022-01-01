import java.util.Scanner;

public class BreakQuest {

    /*
    * 입력한 숫자를 다 더한다
    * 0을 입력 받으면 종료
    *
    *
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n ;
        int total = 0 ;

        while (true){
            System.out.print("Please input number : ");
            n = scan.nextInt();
            total += n;

            if(n==0) break;
        }

        System.out.println("sum of your numbers are : " + total);

    }
}
