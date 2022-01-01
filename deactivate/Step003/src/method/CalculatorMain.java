package method;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

//        System.out.println(cal.sum(10,20));

//        int n1 = cal.inputNumber();
//        int n2 = cal.inputNumber();
//
//        System.out.println(cal.sum(n1, n2));

//        System.out.println(cal.maxInt(10,20));

//        System.out.println(cal.sumOfDigit(12345));


//        System.out.println(cal.odd(1233));
//
//        System.out.println(cal.cToF(50));

        for (int i = 0; i < 10; i++) {

            System.out.println(i + "는 소수입니다 : " + cal.isPrimeNum(i));

        }


    }
}
