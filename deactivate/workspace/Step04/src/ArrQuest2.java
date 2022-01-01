import java.util.Scanner;

public class ArrQuest2 {
    /*
     * 정수형 배열 길이가 10인 배열을 생성
     * 배열에 내용을 전부 입력 받은 후
     * 3의 배수의 합을 출력
     *
     * */


    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "번째 숫자를 입력 : ");
            arr[i] = scan.nextInt();
        }

        scan.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                total += arr[i];
            }
        }

        System.out.println("입력받은 수 중 3의 배수의 합은 " + total);


    }
}
/*
* 배열을 사용할때 :
*
* 입력받는 부분 / 처리하는 부분 / 출력하는 부분
*
* 셋으로 나눈 다음 출력하는 방법이 좋다. (특히 웹개발에서 )
*
*
*
*
*
* */