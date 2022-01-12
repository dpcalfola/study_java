package accessModifier.package1;

public class ClassB {
    public void method() {

        // method() 그냥 밀어넣기 가능 (같은 패키지 안에 같은 메서드 이름 가능)
        // 같은 패키지 안의 클래스의 인스턴스 생성 가능 ( ClassA : public )
        // 같은 패키지 안의 클래스의 field variabl(protected) 접근 가능
        // 같은 패키지 않의 클래스의 method(protected) 접근 가능

        ClassA a = new ClassA();
        a.field = "value";
        a.method();
    }
}
