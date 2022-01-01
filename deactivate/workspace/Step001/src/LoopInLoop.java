import java.util.Scanner;

public class LoopInLoop {

    /*
     * 반복문 중첩
     *
     *
     * 정방향 피라미드 찍기
     *
     * 숫자 하나 입력 받아서
     * 숫자에[ 해당하는 줄 수 만큼 피라미드 출력
     *
     *  ...*     1
     *  ..***    3
     *  .*****   5
     *  *******  7
     *
     *
     * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("피라미드의 층 수를 입력하세요 : ");

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = n-1; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = i; j < i * 3 + 1; j++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }
}
