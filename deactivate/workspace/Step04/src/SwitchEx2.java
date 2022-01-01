import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int n = scan.nextInt();
        scan.close();

        switch (n) {
            case 1:
                System.out.println("One");
                // break 를 안 쓰면 case2 로 넘어간다.
            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

                /// 마지막 케이스에서 break 를 걸지 않으면 default 로 넘어간다.

            default:
                System.out.println("None");

        }
    }
}
