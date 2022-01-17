package exception2;

public class TryCatchFinallyExceptionExample2 {
    public static void main(String[] args) {

        args = new String[2];
        args[0] = "100R";
        args[1] = "101";



        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.printf("%s + %s = %d\n", data1, data2, result);

            return;

        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println("[실행 방법]");
            System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");

        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");

        } finally {
            // try 절에 return; <=== 을 넣어도 finally 절은 반드시 실행된다.
            System.out.println("다시 실행하세요");
        }
    }
}
