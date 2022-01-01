public class OperatorExample5 {
    public static void main(String[] args) {
        int x = 1000000;
        int y = 1000000;



        int iz = x * y;
        long lz1 = (long) x * (long) y;
        long lz2 = (long) (x * y);  // (x * y) 는 int 값. // x,y는 int

        System.out.println(iz);
        System.out.println(lz1);
        System.out.println(lz2);


        long a = 1000000L;
        long b = 1000000L;

        long result1 = a * b ;

        System.out.println(result1);




    }
}
