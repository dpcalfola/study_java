import java.util.Scanner;

public class DoWhileEx {

    /*
     * 숫자 하나 입력 받은 후
     * 숫자에 해당하는 구구단을 출력
     *
     *
     * */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("구구단 : 숫자를 입력하세요 : ");
        int n = scan.nextInt();
        int i = 1;

        scan.close();

        do {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;

        } while (i < 10);

    }
}
