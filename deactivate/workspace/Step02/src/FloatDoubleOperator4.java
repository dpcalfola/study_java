public class FloatDoubleOperator4 {

    public static void main(String[] args) {
        float f = 3.1415f ;
        double d = 3.1415 ;

        double parsF = (double)f ;

        // 형 변환시 잡음 발생 가능 , 고로 실수는 되도록 비교연산자를 잘 사용하지 않는다
        // 실수 끼리는 변환 가능

        System.out.println(f == d);
        System.out.println(parsF == d);
    }
}
