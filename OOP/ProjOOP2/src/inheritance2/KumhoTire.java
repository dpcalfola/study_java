package inheritance2;

public class KumhoTire extends Tire{

    public KumhoTire (String location, int maxRotation) {
        super(location, maxRotation);
    }

    public boolean roll() {
        ++accumulateRotation;
        if (accumulateRotation < maxRotation) {
            System.out.printf("%s KumhoTire 수명: %d 회\n", location, maxRotation - accumulateRotation);
            return true;
        } else {
            System.out.printf("*** %s KumhoTire 펑크 ***", location);
            return false;
        }

    }

}
