import java.util.Scanner;

public class Quest3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "번째 숫자를 입력하세요 : ");
            arr[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

            sum += arr[i];
        }

        System.out.println();
        System.out.print("배열에 저장되니 숫자들 중 최대값은 : " + max + "입니다 \n");
        System.out.print("배열에 저장되니 숫자들 중 최소값은 : " + min + "입니다 \n");
        System.out.print("배열에 저장되니 숫자들의 총합은 : " + sum + "입니다 \n");


    }
}
