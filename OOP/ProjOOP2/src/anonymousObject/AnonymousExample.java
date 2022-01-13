package anonymousObject;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous annoy = new Anonymous();
        annoy.field.wake();
        annoy.method1();
        annoy.method2(new Person() {
            void study() {
                System.out.println("Study");

            }

            void wake() {
                System.out.println("Wake up at 8:00");
                study();
            }

        });


    }
}
