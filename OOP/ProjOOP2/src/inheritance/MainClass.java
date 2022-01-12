package inheritance;

public class MainClass {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
//        a.methodB(); // 모부 클래스는 자식 클래스의 멤버변수를 가져올 수 없다.

        B b = new B();
        b.methodA();
        b.methodB();
    }
}
