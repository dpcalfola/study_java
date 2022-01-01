import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("1. 블랙커피");
        System.out.println("2. 설탕커피");
        System.out.println("3. 밀크커피");
        System.out.print("원하시는 메뉴를 선택하세요 : ");

        int kind = scan.nextInt();
        scan.close();

        System.out.println();


        switch (kind) {
            case 3:
                System.out.println("프림");
            case 2:
                System.out.println("설탕");
            case 1:
                System.out.println("커피");
            default:
                System.out.println("뜨거운 물");
        }

        System.out.println("\n커피가 나왔습니다");


    }
}
