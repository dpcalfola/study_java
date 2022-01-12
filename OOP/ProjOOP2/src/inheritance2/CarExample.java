package inheritance2;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 1; i <= 20; i++) {
            int problemLocation = car.run();

            switch (problemLocation) {
                case 1:
                    System.out.println("FrontLeft tire is changed to HankookTire");
                    car.tires[0] = new HanKookTire("FrontLeft", 15);
                    break;
                case 2:
                    System.out.println("FrontLeft tire is changed to HankookTire");
                    car.tires[1] = new HanKookTire("frontRight", 13);
                    break;
                case 3:
                    System.out.println("FrontLeft tire is changed to HankookTire");
                    car.tires[2] = new HanKookTire("backLeft", 14);
                    break;
                case 4:
                    System.out.println("FrontLeft tire is changed to HankookTire");
                    car.tires[3] = new HanKookTire("backRight", 17);
                    break;

            }
            System.out.println();
            System.out.println("-------------------------------------------------------------");
            System.out.println();
        }

    }
}
