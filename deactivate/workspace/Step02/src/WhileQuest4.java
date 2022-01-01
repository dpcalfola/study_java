import java.util.Scanner;

public class WhileQuest4 {

    /*
    *
    * 숫자 0을 입력 할때까지 입력을 받고
    * 0을 입력하면 더이상 입력 받지 않고
    * 입력한 숫자들의 총합을 출력
    *
    *
    * */




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNum = -1 ;
        int sum = 0 ;

        while(inputNum != 0) {
            System.out.print("Please input your number : ");
            inputNum = scan.nextInt();
            sum += inputNum ;

        }
        scan.close();
        System.out.println("\nSum is " + sum);
    }
}
