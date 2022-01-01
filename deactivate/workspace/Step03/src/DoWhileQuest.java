import java.util.Scanner;

public class DoWhileQuest {


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


        int sum = 0;
        int inputNum;

        do {
            inputNum = scan.nextInt();
            sum += inputNum;
        } while (inputNum != 0);

        scan.close();

        System.out.println(sum);
    }
}
