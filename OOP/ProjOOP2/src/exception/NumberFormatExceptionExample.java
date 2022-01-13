package exception;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        // NumberFormatException
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.printf("%d + %d = %d\n", data1, data2, result);

        // Integer <=== wrapper class
        // parseInt <=== Integer 클래스 안에 있는 method


    }
}
