package method;

import java.util.Scanner;

public class Calculator {
    // 결과를 정수로 리턴하고, 정수형 데이터 두개를 데이터로 받는 메서드


    int sum(int a, int b) {
        int result = a + b;
        return result;
    }
    // 리턴 o , 매개변수 o


    int inputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();
        return num;

    }
    // 리턴 o , 매개변수 x


//    int maxInt2(int a, int b) {
//        return Math.max(a, b);
//    }

    int maxInt(int a, int b) {
        return a > b ? a : b;
    }


    int sumOfDigit(int n) {

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    //// 메서드 : 정수값 한개를 받아서 정수가 홀수면 true , 짝수면 false 를 리턴한다

    boolean odd(int a) {
        return a % 2 != 0;
    }


    /// 메서드 : 섭씨 온도를 하나 받아서 받아온 섭시 온도를 화씨온도로 변환해서 리턴
    // (0°C × 9/5) + 32 = 32°F

    double cToF(double a) {
        return a * 1.8 + 32;
    }


    // 메서드 : 정수 하나 입력 받아서 받아온 정수가 소수면 true 소수가 아니면 false 리턴


    boolean isPrimeNum(int a) {

        if (a < 2) {
            return false;

        }

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }

        }

        return true;

    }


}
