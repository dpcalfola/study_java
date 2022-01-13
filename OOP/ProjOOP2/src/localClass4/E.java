package localClass4;

public class E {
    void method(){
        class F{

            // constructor
            F(){
            }

            //
            int field1;

            //
            void method1(){
                System.out.println("class E - method() - class F method1()");
            }

            // static method: Impossible
//            static void method2(){
//
//            }

            F f = new F();

        }
    }
}
