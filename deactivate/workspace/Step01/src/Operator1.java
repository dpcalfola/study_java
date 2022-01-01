public class Operator1 {



    /*
     * 사칙연산
     *  + 덧셈
     *  - 뺄셈
     *  * 곱셈
     *  / 나눗셈 -> 몫
     *  % 나눗셈 -> 나머지
     *
     *
     */

    public static void main(String[] args) {
        // 정수형 변수 2개 선언 - n1, n2
        // 데이터는 자유롭게 초기화

        //        int n1 = 30 ;
        //        int n2 = 23 ;


        int n1 = 30, n2 = 7;  // 같은 타입의 변수 선언과 초기화를 한줄로 가능하다

//        System.out.println(n1 + " " + n2);

        int result = 0;
        result = n1 + n2; // 값이 저장되는것임 (n1 + n2 식이 저장되는 것이 아님)

        n1 = 100 ;

        System.out.println(result);

    }
}
