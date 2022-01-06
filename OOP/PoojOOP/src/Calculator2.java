public class Calculator2 {

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double plus(double x, double y) {
        double result = x + y;
        return result;
    }

    public static void main(String[] args) {
        Calculator2 myCalc = new Calculator2();
        int res1 = myCalc.plus(5, 10);
        double res2 = myCalc.plus(10.5, 20.3);
        double res3 = myCalc.plus(3, 10.7);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
