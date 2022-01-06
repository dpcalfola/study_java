package car;

public class Car {

    String company = "Hyundai";
    String model;
    String color;
    int maxSpeed;

    // 생성자s 시작
    Car() {
    }

    Car(String model) {
        this.model = model;
    }


    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 요런식으로는 안됨. 위의 스트링 타입 두개랑 겹침. 충
//    Car(String color, String model) {
//        this.color = color;
//        this.model = model;
//
//    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    // 생성자 끝


    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println("car1.model: " + car1.model);
        System.out.println("car1.color: " + car1.color);
        System.out.println();

        Car car2 = new Car("Sonata");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println("car2.color: " + car2.color);
        System.out.println();

        Car car3 = new Car("Sonata", "red");
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.color: " + car3.color);
        System.out.println();

        Car car4 = new Car("Sonata", "red", 190);

        car4.company = "KIA"; // 덮어쓰기 가능

        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model: " + car4.model);
        System.out.println("car4.color: " + car4.color);
        System.out.println("car4.maxSpeed: " + car4.maxSpeed);

        System.out.println();

    }
}