package mathClass;

public class MathClass {
    public static void main(String[] args) {

        // 소수점 아래 둘째자리까지 반올림 하는 방법
        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        double v16 = temp2/100.0;

        System.out.println(value);
        System.out.println(temp1);
        System.out.println(Math.round(temp1));
        System.out.println(temp2);
        System.out.println(v16);
    }
}
