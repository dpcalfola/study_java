package constructorExplicitCall;

public class Child extends Parent {

    private int ChildNo;

    // getter and setter
    public int getChildNo() {
        return ChildNo;
    }

    public void setChildNo(int childNo) {
        ChildNo = childNo;
    }

    Child(int childNo) {
        this.ChildNo = childNo ;
    } // 부모 클래스에 기본형 생성자를 명시해주지 않으면 컴파일 에러 발생 // Parent() { } <=== 이거 필요함


    Child(String name, String ssn, int childNo) {
        super(name, ssn); //    super <<=== 부모 클래스의 this
        this.ChildNo = childNo;
    }
}
