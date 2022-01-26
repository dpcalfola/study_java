package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력부
        int inputNum;
        while (true) {
            System.out.println("1부터 입력받은 정수까지의 합을 구하는 프로그램입니다.");
            System.out.print("100 이하의 양의 정수를 입력하세요: ");
            inputNum = Integer.parseInt(br.readLine());

            if (inputNum > 0 && inputNum <= 100) {
                break;
            } else {
                System.out.println("error: 숫자는 1 이상 100 이하의 정수만 입력 가능합니다.\n");
            }
        }
        br.close();

        // 연산부
        int sum = 0;
        int num = inputNum;
        while (num <= 100) {
            sum += num++;
        }

        // 출력부
        System.out.printf("\n%d부터 100까지 정수의 합은 %d입니다.\n", inputNum, sum);

    }
}
