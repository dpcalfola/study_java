package interface2;

public class JetPlane extends Plane implements Flyable, Soundable {
    @Override
    public void sound() {
        System.out.println("Jet Sound: SHOOOOONG");
    }

    @Override
    public void fly() {
        System.out.println("Jet Plane Flies");
    }
}
