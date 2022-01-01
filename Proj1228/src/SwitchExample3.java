import java.util.Scanner;

public class SwitchExample3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();

        int n = 7 ;

        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
            default:
                System.out.println("C");

        }

    }


}
