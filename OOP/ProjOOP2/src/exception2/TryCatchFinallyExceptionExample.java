package exception2;

public class TryCatchFinallyExceptionExample {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;

        try{
            data1 = args[0];
            data2 = args[1];
        }catch ( ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족합니다.");
            System.out.println("[실행 방법]");
            System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");


            // return: main method 탈출
            return;
        }

        System.out.println("return test");
    }



}
