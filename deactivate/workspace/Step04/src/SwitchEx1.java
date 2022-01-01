import java.util.Scanner;

public class SwitchEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int n = scan.nextInt();





        switch (n) {
            case 1:
                System.out.println("One");
                break;                      // break 를 안 쓰면 case2 로 넘어간다.
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("None");

        }

    }
}
