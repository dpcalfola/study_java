public class OperatorExample7 {
    public static void main(String[] args) {
        int x = 5 ;
        double y = 0.0 ;

        double z = x / y ;
        double z2 = x % y ;

        // int 0 으로 나누면 Arithmetic Exception
        // double 0 으로 나누면 Infinity

        System.out.println(Double.isInfinite(z));
        System.out.println(Double.isNaN(z));
        System.out.println(z+2); // Infinity
        System.out.println(z); // Infinity
        System.out.println(Double.isNaN(z2));
    }
}
