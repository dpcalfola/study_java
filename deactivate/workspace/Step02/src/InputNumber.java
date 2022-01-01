import java.util.Scanner;

public class InputNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a;
        System.out.print("Please input number : ");
        a = scan.nextInt();

        System.out.println("Inputted number is " + a);

        scan.close();


        System.out.println("-----------------");

        System.out.println(Integer.MAX_VALUE);
    }
}
