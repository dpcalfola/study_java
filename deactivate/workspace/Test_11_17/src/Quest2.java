import java.util.Scanner;

public class Quest2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("숫자 하나를 입력하세요.");
        int n = scan.nextInt();
        scan.close();

        System.out.print(n + "의 약수는 ");


        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("입니다.");

    }
}
