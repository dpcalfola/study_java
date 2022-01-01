public class Operator5 {


    /*
     * 논리 연산자
     *   AND : &&
     *   OR : ||
     *   NOT : ! ====>> true--> false / false-->true
     *
     *
     *
     * */

    public static void main(String[] args) {
        // n 5보다 크고 20보다 작은지?

        int n = 10;

        boolean booleanA = (n > 5) && (n < 20);

        System.out.println("n이 5보다 큰지? : " + (n > 5));
        System.out.println("n이 20보다 작은지? : " + (n < 20));
        System.out.println("n이 5보다 크고 20보다 작은지? :" + booleanA);
        System.out.println("1 " + (n==10 || n<5));

        boolean result = n == 10 || n<5 ;
        System.out.println("2 " + !result);

        result = !result ;
        System.out.println("3 " + result);
    }
}
