package Constructor;

public class Animal {
    String type;
    int age;
    String gender;


    public Animal() {
        super();
    }
    // 슈퍼클래스에 대하여 알아볼것


    public Animal(String type, int age, String gender) {
        this.type = type;
        this.age = age;
        this.gender = gender;
    }
}
