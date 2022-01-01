import java.util.Scanner;

public class SwitchEx1_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String str = scan.next();

        switch (str) {
            case "a":
                System.out.println("One");
                break;
            case "b":
                System.out.println("Two");
                break;
            case "c":
                System.out.println("Three");
                break;
            default:
                System.out.println("None");

        }

    }
}
