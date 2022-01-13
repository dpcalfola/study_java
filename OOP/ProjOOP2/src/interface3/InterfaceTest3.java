package interface3;

public class InterfaceTest3 {
    public static void main(String[] args) {

        // 인터페이스는 인스턴스 생성 불 (어나니머스 만 가능 == 1회용 )
//        In3 in3 = new In3();


        ExtendsTest et = new ExtendsTest();

        et.in1Method();
        et.in2Method();

        System.out.println(In1.x);
        System.out.println(In2.x);
        // 불가능
//        System.out.println(In3.x);
        // The field In3.x is ambiguous (ambiguous: 모호한)



    }
}
