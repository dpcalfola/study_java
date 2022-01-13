package interface2;

public class Example {
    public static void main(String[] args) {
        JetPlane jet = new JetPlane();

        // 상속받은 void
        jet.move(); // Plane 클래스에서 상속받은 void


        // 다중 상속된 인터페이스 실행
        jet.fly(); // Flyable 인터페이스를 JetPlane 에서 구현한 void
        jet.sound(); // Soundable 인터페이스를 JetPlane 에서 구현한 void

    }
}
