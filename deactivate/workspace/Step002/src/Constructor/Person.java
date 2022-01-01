package Constructor;

public class Person {

    String name;
    int age;



    /*
     * 생성자(constructor)
     *
     *
     * */


    Person() {
        System.out.println("Person 생성자 호출");
    }

    Person(String n , int a){
        name = n;
        age = a ;
    }


    Person(String n){
        name = n;
        age = 30 ;

    }

    // String n , int a <<- 매개변수


}
