public class OperatorExample6 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;


        double result = apple - number * pieceUnit; // double - (int * double) 오차 발생 가능성. 주의.
        // 오차 발생

        int totalPieces = apple * 10;
        int temp = totalPieces - number;

        double result2 = temp / 10.0;


        System.out.println(result);

        System.out.println(result2);


        System.out.println();
        System.out.println();
        System.out.println("====================");
        System.out.println();


        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MIN_NORMAL);
    }
}
