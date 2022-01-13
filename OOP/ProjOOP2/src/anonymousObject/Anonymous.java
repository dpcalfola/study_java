package anonymousObject;

public class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("Go to workplace");
        }

        void wake() {
            System.out.println("Wake up at 6:00");
        }

    };


    void method1() {
        Person localVar = new Person() {
            void walk() {
                System.out.println("Go for a walk");
            }

            void wake() {
                System.out.println("Wake up at 7:00");
                walk();
            }

        };


        localVar.wake();

    }

    void method2(Person person){
        person.wake();
    }

}
