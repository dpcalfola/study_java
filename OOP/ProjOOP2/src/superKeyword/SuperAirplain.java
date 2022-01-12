package superKeyword;

public class SuperAirplain extends Airplain {
    public static final int NORMAL = 1;
    public static final int SUPER = 2;

    public int flyMode = NORMAL;


    // 메서드 오버라이딩: 부모의 메서드를 무시하고 자식의 메써드를 사용한다
    public void fly() {
        if (flyMode == SUPER){
            System.out.println("초음속 비행중");
        }else{
            super.fly();
        }
    }
}
