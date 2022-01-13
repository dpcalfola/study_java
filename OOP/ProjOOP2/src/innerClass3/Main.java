package innerClass3;

public class Main {
    public static void main(String[] args) {
        C.D c = new C.D();

        // static outClass 인스턴스 생성 이후로 innerClass 의 field 변수 접근 가능
        c.field1 = 4;
        c.method1();
        System.out.println("c.field1: " + c.field1);


        // D innerClass 선언 없이도 Static field 접근 가능
        C.D.field2 = 5 ;

        // static class 임에도 불구하고 일반 필드는 innerClass 를 생성하지 않았기 때문에 접근 불가능
//        C.D.field1 = 1 ;

        System.out.println("C.D.field2: " + C.D.field2);
        C.D.method2();
    }
}
