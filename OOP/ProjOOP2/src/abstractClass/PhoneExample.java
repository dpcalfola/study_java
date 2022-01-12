package abstractClass;

public class PhoneExample {
    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("Fola");
        smartPhone1.turnOn();
        smartPhone1.internetSearch();
        smartPhone1.turnOff();
        smartPhone1.printOwner();
        System.out.println(smartPhone1.getOwner());

        System.out.println("\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n");

        SmartPhone smartPhone2 = new SmartPhone("Klay");
        smartPhone2.turnOn();
        smartPhone2.internetSearch();
        smartPhone2.turnOff();
        smartPhone2.printOwner();


        System.out.println("\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n");

        Phone phone1 = new SmartPhone("Booker"); // Ummmmmmmmmm......
        phone1.turnOn();
        phone1.turnOff();
        phone1.printOwner();

    }
}
