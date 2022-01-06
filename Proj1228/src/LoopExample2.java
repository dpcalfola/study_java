

public class LoopExample2 {
    public static void main(String[] args) {


        // 1 ~ 10 짝수만 출력하는 for 문
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i+ " ");
        }
        System.out.println();

        // 3 6 9 12 15
        for (int i = 3; i <= 15 ; i += 3) {
            System.out.print(i+ " ");
        }
        System.out.println();

        // 20 19 18 17
        for (int i = 20; i > 16 ; i--) {
            System.out.print(i+ " ");
        }


    }
}
