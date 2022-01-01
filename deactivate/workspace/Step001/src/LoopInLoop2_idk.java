import java.util.Scanner;

public class LoopInLoop2_idk {

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

        String result = "" ;

        for (int i = 1; i <=n; i++) {

            for (int j = 0; j < i ; j++) {
                result += ".";
            }
            for (int j = 0; j <i*2-1 ; j++) {
                result += " *";

            }

            result += "\n";

        }

        System.out.println(result);


    }
}
