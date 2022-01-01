public class IntExample {
    public static void main(String[] args) {

        int var1 = 10 ;
        int var2 = 012 ;
        int var3 = 0xA ;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        // 형식지정자를 이용하여 8진수와 16진수를 프린트 하는 방법
        // 형식지정자를 사용하지 않을 경우 8진수, 16진수값 변수가 자동으로 10진수로 변환되어 출력된다.

        System.out.printf("0%o\n" , var2);
        System.out.printf("0x%X\n" , var3);
    }
}
