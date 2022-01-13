package interface1;

public class RemoteControlExample2 {
    public static void main(String[] args) {

        // 인스턴스 생성 불가능: 인터페이스의 인스턴스는 생성 불가능
        // 에러메세지: 추상메서드는 인스턴스 생성 불가
//        RemoteControl re = new RemoteControl()

        RemoteControl rc1 = new Audio();
        rc1.turnOn();
        rc1.turnOff();

        System.out.println("======================================");

        RemoteControl rc2 = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("RemoteControl - turnOn()");
            }

            @Override
            public void turnOff() {
                System.out.println("RemoteControl - turnOff()");
            }

            @Override
            public void setVolume(int volume) {
            }
        };

        rc2.turnOn();
        rc2.turnOff();
    }
}
