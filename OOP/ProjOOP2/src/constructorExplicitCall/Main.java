package constructorExplicitCall;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Child c = new Child("Fola", "123456-1234567", 1);

        System.out.println("Name : " + c.getName());
        System.out.println("ssn : " + c.getSsn());
        System.out.println("ChildNo : " + c.getChildNo());

    }
}
