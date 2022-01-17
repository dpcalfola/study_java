package object.shallowClone;

public class ClassCopyTest {
    public static void main(String[] args) {


        Member original1 = new Member("Blue", "Fola", "12345", 25, true);
        Member copyClass = new Member("Fake", "Fake", "Fake", 0, false);

        copyClass = original1;

        System.out.println("copyClass id : " + copyClass.id);

        copyClass.id = "New ID";

        System.out.println("copyClass changed id: " + copyClass.id);


    }
}
