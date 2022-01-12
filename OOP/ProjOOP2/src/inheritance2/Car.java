package inheritance2;

public class Car {
//    Tire frontLeftTire = new Tire("FrontLeft", 6);
//    Tire frontRightTire = new Tire("FrontLeft", 2);
//    Tire backLeftTire = new Tire("backLeftTire", 3);
//    Tire backRightTire = new Tire("BackRightTire", 4);

    int run() {
        System.out.println("The Car is running now !!");
        if (tires[0].roll() == false) {
            stop();
            return 1;
        }
        if (tires[1].roll() == false) {
            stop();
            return 2;
        }
        if (tires[2].roll() == false) {
            stop();
            return 3;
        }
        if (tires[3].roll() == false) {
            stop();
            return 4;
        }
        return 0;
    }

    void stop() {
        System.out.println("The Car is stopped.");
    }


    Tire[] tires = {
            new Tire("FrontLeFt", 6),
            new Tire("FrontRight", 6),
            new Tire("BackLeFt", 6),
            new Tire("BackRight", 6)

    };


}
