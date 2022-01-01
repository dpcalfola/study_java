public class Char {
    /*
    *  char : 문자형 ---> 한글자만 저장하는 변수 타입 ( != 문자열 )
    *  char : 2byte in JAVA
    *
    *
    * */


    public static void main(String[] args) {

        char c1 = 'A';  // << 문자형은 작은 따움표로 감싼다.
        char c2 = 'B';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 + c2);


        int i1 = c1 ; // 문자형의 아스키코드 확인하는 방법
        System.out.println(i1);

        int i2 = 'a';
        int i3 = 'z';

        System.out.println(i2);
        System.out.println(i3);

        System.out.println("--------");


        char 한글자 = '가' ;
        System.out.println(한글자);  // 변수명으로 한글 사용 가능하나 추천하지 않는다.


    }
}
