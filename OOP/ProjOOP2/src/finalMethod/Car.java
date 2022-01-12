package finalMethod;

public class Car {
    public int speed;

    public void speedUp() {
        speed += 1;
    }


    // final method: 자식 클래스가 오버라이딩 할 수 없도록 제한
    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }

}
