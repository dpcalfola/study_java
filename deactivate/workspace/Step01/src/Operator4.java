public class Operator4 {

    /*
     * 증감 연산자 : 변수에 있는 값을 1씩 증가, 1씩 감소 ( ++ , -- )
     *
     *
     * 변수++ --> 후위형 : 변수가 포함된 일을 먼저 실행 한 후 증가
     * ++변수 --> 전위형 : 변수를 먼저 증가시킨 후 일을 실행
     *

     */


    public static void main(String[] args) {


        int n1 = 10;

        System.out.println(n1);
        System.out.println(n1++);  // 주의 !! 전위형/후위형 증감연산자 !!
        System.out.println(n1);


        System.out.println("");


        int n2 = 10;

        System.out.println(n2);
        System.out.println(++n2);
        System.out.println(n2);

        System.out.println("");


        int n3 = 10;
        int result = n3++ + 10 + ++n3 - 2;

        System.out.println(result);


    }
}
