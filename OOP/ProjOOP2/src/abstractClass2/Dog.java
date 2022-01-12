package abstractClass2;

public class Dog extends Animal {

    public Dog() {
        this.kind = "Mammal";
    }

    @Override
    public void sound() {
        System.out.println("Woof woof ✳︎✳︎");
    }
}
