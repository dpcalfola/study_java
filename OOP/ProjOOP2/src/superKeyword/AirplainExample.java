package superKeyword;

public class AirplainExample {
    public static void main(String[] args) {
        SuperAirplain sa = new SuperAirplain();

        sa.takeoff();
        sa.fly();
        sa.flyMode = SuperAirplain.SUPER;
        sa.fly();
        sa.flyMode = SuperAirplain.NORMAL;
        sa.fly();
        sa.land();

    }
}
