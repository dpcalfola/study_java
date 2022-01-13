package innerClass2;

public class A {
    class B {

        // 생성자
        B() {
        }

        // instance field
        int field1;

        // static instance field: impossible
//        static int field2;

        // instance method
        void method1() {
            System.out.println("class B - method1");
        }

        // static method: impossible
//        static void method2(){
//        }

    }
}
