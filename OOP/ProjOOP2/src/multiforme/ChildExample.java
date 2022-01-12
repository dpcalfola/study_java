package multiforme;

public class ChildExample {
    public static void main(String[] args) {

        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        System.out.println("=================================");

        Parent parent = new Parent();
        parent.method1();
        parent.method2();
//        parent.method3(); // 안됨

        System.out.println("=================================");
        Parent parent2 = new Child();
        parent2.method1(); // Parent method1()
        parent2.method2(); //Child method2()
//        parent2.method3(); // 안됨

        System.out.println("=================================");
        parent = child;
        parent.method1();
        parent.method2();
    }
}
