package person;

public class PersonExample {

    public static void print(){
        int a = 3 ;
        System.out.println(3);

    }



    public static void main(String[] args) {

        int a = 5 ;
        System.out.println(a);
        print();

        System.out.println("=========================================");



        Person p1 = new Person("123456-1234567", "KyeBaek");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "USA";
        // the final field cannot be assigned
//        p1.ssn = "654321-7654321";
        // the final field cannot be assigned


        // 변수 변경 가능
        p1.name = "LeeSoonsin";

        System.out.println("---------------------------------------");
        System.out.println(p1.name);

    }
}
