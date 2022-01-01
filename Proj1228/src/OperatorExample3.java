public class OperatorExample3 {
    public static void main(String[] args) {
        short s = 100 ;
//        short result = -s ;

        int result2 = -s ;
        // short 타입에 - 를 붙이면 int value 로 자동변환

        System.out.println(s);
        System.out.println(result2);

        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE);  // -32768

        short a = -100 ;



    }
}
