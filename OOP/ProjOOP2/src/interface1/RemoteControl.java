package interface1;

// 인터페이스

// 상수: 타입 상수명 = 값;
// final 붙어 있지 않아도 상수가 됨

// 추상 메소드: 타입 메소드명(매개변수,...);
// abstract 키워드가 없어도 추상메서드 취급받음

// 디폴트 메소드: default type method
// 추상 메서드 외에도 직접적인 메서드를 작성하고 싶을 때 default 를 붙임
// 인터페이스 안해서도 메서드 작성 후 상속 시킬 수 있음

// 정적 메소드: static type method
// static: 프로그램 시작과 동시에 메모리에 올림

public interface RemoteControl {

    // const
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // abstract method
    public void turnOn();

    public void turnOff();

    public void setVolume(int volume);


    // default method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("System: Muted");
        } else {
            System.out.println("System: UnMuted");
        }
    }

    static void changeBattery() {
        System.out.println("System: Change battery");
    }
}