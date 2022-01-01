import java.util.Scanner;

public class Quest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int temp = 0;

        for (int j = 0; j < arr.length; j++) {
            System.out.print(j + "번째 숫자를 넣으세요 : ");
            temp = scan.nextInt();


            if (temp % 2 == 1) {
                arr[j] = temp;

            } else {
                arr[(arr.length - (j+1))] = temp;
            }

        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }


    }


}

