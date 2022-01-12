package abstractClass;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public String getOwner(){
        return owner;
    }

    public void turnOn() {
        System.out.printf("Turn On %s's Phone ☆☆\n", owner);
    }

    public void turnOff() {
        System.out.printf("Turn Off %s's Phone ☆☆\n", owner);
    }

    public void printOwner() {
        System.out.printf("This phone is owned by %s ☆☆\n", owner);
    }
}
