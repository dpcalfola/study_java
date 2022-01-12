package finalMethod;

public class SportsCar extends Car {

    // override possible
    public void speedUp() {
        speed += 10 ;
    }

    //override impossible cause of final method
//    public void stop(){
//        System.out.println("SportsCar를 멈춤");
//        speed = 0;
//    }
}
