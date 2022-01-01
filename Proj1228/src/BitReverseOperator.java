public class BitReverseOperator {
    public static void main(String[] args) {
        int a = 2 ;
        int b = 0 ;
        b = ~a ;

        System.out.println(a);
        System.out.println(b);


        b = ~b ;

        System.out.println(b);

        a = ~a ;

        System.out.println(a);
    }
}
