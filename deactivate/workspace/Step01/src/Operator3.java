public class Operator3 {

    /*
     * 복합대입연산자
     * += =+ *= /= %=
     *
     */


    public static void main(String[] args) {

        int result = 5;
        result = result + 5;
        System.out.println("result : " + result);


        result += 5; // 복합 대입 연산자
        System.out.println("result += : " + result);

        result -= 5; // 복합 대입 연산자
        System.out.println("result -= : " + result);

        result *= 5; // 복합 대입 연산자
        System.out.println("result *= : " + result);

        result /= 5; // 복합 대입 연산자
        System.out.println("result /= : " + result);

        result %= 5; // 복합 대입 연산자
        System.out.println("result %/ : " + result);

        System.out.println("");

        // 복합연산자 += <- 문자열 조립용도로 많이 사용

        String tel = "010" ;
        tel += "+3456";
        tel += "-7890";

        System.out.println(tel);



    }
}
