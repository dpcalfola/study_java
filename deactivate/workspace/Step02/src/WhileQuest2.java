import java.util.Scanner;

public class WhileQuest2 {


    /*
     *  숫자 하나를 입력 받은 뒤 입력받은 숫자 만큼 Hello World 를 출력
     *
     *
     *
     * */

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int repeatNum;
//
//        System.out.print("Input repeat number : ");
//        repeatNum = scan.nextInt();
//        scan.close();
//
//        int i = 0;
//
//        while (i < repeatNum) {
//            String strI = String.format("%-2s", Integer.toString(i + 1));
//            System.out.println(strI + " : " + "Hello world !!");
//            i++;
//        }
//
//        System.out.println("--------------------");





        Scanner scan = new Scanner(System.in);

        System.out.print("Input repeat number : ");
        int n = scan.nextInt();


        while(!(n<=0)){

            System.out.println("Hello World");
            n--;
        }
































    }
}
