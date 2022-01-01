import java.util.Scanner;

public class Quest4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int temp = 0;

        for (int j = 0; j < arr.length; j++) {
            System.out.println(j + "번째 숫자를 넣으세요 : ");

            temp = scan.nextInt();
            if (temp % 2 == 0) {
                //짝수라면
                break;
            }
            arr[j] = temp;


            for (int i = 0; i < arr.length; i++) {

               ;


            }

            for (int i = 9; i > 0; i--) {

                temp = scan.nextInt();
                if (temp % 2 == 1) {
                    //홀수라면
                    break;
                }
                arr[i] = temp;

            }


        }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
