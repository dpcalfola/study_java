package instanceOf2;

public class InstanceOfExample {
    public static void main(String[] args) {

        Parent p1 = new Child();
        method1(p1);
        method2(p1);

        Parent p2 = new Parent();
        method1(p2);
        method2(p2);


    }


    // method
    public static void method1(Parent p) {
        if (p instanceof Child) {
            Child c = (Child) p;
            System.out.println("method1 - Child 로 변환 성공");
        } else {
            System.out.println("method1 - Child 로 변환 실패");

        }
    }


    public static void method2(Parent p) {
        Child c = (Child) p;
        System.out.println("method2 - Child 로 변환 성공");
    }
}
