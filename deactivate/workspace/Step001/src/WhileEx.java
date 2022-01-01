import java.util.Scanner;

public class WhileEx {
    /*
    * 숫자 하나 입력 받아서
    * 1부터 입력한 숫자까지 합을 출력
    *
    * */

    public static void main(String[] args) {
        System.out.print("숫자 N 을 입력하세요 : ");

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int count = 0 ;
        int sum = 0 ;

        while (count <= N ){
            sum += count;
            count++ ;
        }

        System.out.println("1부터 N 까지의 자연수의 총 합 : " + sum);

    }
}
