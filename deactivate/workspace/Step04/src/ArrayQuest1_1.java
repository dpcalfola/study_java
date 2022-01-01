import java.util.Scanner;

public class ArrayQuest1_1 {

    /*
     * 정수형 배열 길이가 10개인 배열 선언
     * 배열에 숫자를 전부 입력
     * 배열에 입력된 숫자들을 전부 출력
     *
     *
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i : arr) {    // 뭐가 다르지;;;
            System.out.print(i + 1 + "번쨰 숫자를 입력하세요 : ");
            arr[i] = scan.nextInt();
        }
        for (int j : arr) {
            System.out.println(j);
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


    }
}
