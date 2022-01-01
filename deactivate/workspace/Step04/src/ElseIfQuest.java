import java.util.Scanner;

public class ElseIfQuest {
    /*
     *
     * 입장료 계산 프로그램
     * 나이를 입력 받고
     * 나이에 해당하는 입장료를 출력
     *
     * 0-7 : 무료
     * 8-19 : 1000원
     * 20 - 59 : 1500원
     * 60- : 1200원
     *
     * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나이를 입력하세요 : ");
        int age = scan.nextInt();
        int price = 0;
        scan.close();


        if (age <= 7) ;

        else if (age <= 19) price = 1000;

        else if (age <= 59) price = 1500;

        else price = 1200;

        System.out.println("입장료는 " + price + "원 입니다.");

    }
}
