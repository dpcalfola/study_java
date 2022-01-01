package arr;

import java.util.Scanner;

public class ArrayInput {
    /*
     * 정수형 배열 길이가 5인 배열을 생성
     * 생성 후 배열에 숫자를 입력하신 후 출력
     *
     *
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i + "번째 숫자를 입력하세요 : ");
//            arr[i] = scan.nextInt();
//        }


        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) Math.floor(Math.random() * 10);
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "번째 숫자는 ");
            System.out.println(arr[i] + "입니다");

        }
    }
}
