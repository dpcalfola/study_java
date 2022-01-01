package method;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal("dog", 4) ;
        animal.eat("사료");


        System.out.println("------------------");

        animal.printInfo();
    }
}
