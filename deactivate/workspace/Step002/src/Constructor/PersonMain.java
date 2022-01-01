package Constructor;

public class PersonMain {

    public static void main(String[] args) {

        Person p = new Person(); //기본 생성자 호출


        p = new Person("Fola", 500);
        // << 오버로딩 : 매개변수에 타입과 개수에 맞추어 실행할 생성자를 결정

        p = new Person("Flor");
        // p 에 나중값이 덮어 씌워짐

        System.out.println(p.name + " " + p.age);

        System.out.println("\n< Program is ended >");

    }
}
