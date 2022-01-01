import java.util.Scanner;

public class ForQuest2 {
    /*
     * 숫자 하나 입력 받은 뒤 입력받은 숫자만큼 헬로월드 출력
     *
     * */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please input repeat number ");

        int repeat = scan.nextInt();
        scan.close();

        for (int i = 0; i < repeat; i++) {
            System.out.printf("%-2s", i + 1);
            System.out.println(": Hello World");


        }


    }
}
