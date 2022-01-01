package method;

public class Animal {

    String type;
    int age;

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    /*
     *
     *           리턴타입 메서드이름(매개변수){
     *
     *               실행할 코드
     *
     *           }
     *
     *
     *
     * */

    void eat(String food) {
        System.out.println(type + "이(가) " + food + "를 먹습니다");
    }
    // 리턴 x , 매개변수 o


    void printInfo() {
        System.out.println("Kind : " + type);
        System.out.println("Age : " + age);
    }
    // 리턴 x , 매개변수 x


    // void : 리턴타입이 없고 리턴할 값이 없음.
}
