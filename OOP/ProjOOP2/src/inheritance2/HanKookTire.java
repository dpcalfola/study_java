package inheritance2;

public class HanKookTire extends Tire {
    public HanKookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    public boolean roll() {
        ++accumulateRotation;
        if (accumulateRotation < maxRotation) {
            System.out.printf("%s HankookTire 수명: %d 회\n", location, maxRotation - accumulateRotation);
            return true;
        } else {
            System.out.printf("*** %s HanKookTire 펑크 ***", location);
            return false;
        }

    }
}
