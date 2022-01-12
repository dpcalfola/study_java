package abstractClass2;

public class AnimalExample {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        dog1.sound();
        cat1.sound();

        System.out.println("\n1. ----------------------------");


        Animal animal1 = null;
        animal1 = new Dog();
        animal1.sound();
        animal1 = new Cat();
        animal1.sound();

        System.out.println("\n2. ----------------------------");

        animalSound( new Dog());
        animalSound( new Cat());


        System.out.println("\n3. ----------------------------");

        animalSound(dog1);
        animalSound(cat1);



    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }



}
