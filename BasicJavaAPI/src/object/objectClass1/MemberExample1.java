package object.objectClass1;

public class MemberExample1 {
    public static void main(String[] args) {

        Member obj1 = new Member("blue");
        Member obj2 = obj1 ;
        Member obj3 = new Member("red") ;

        if (obj1.equals(obj2)){
            System.out.println("obj1 obj2 는 동등합니다.");
        } else {
            System.out.println("obj1 obj2 는 동등하지 않습니다..");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1 obj3 는 동등합니다.");
        } else {
            System.out.println("obj1 obj3 ㅜ 는 동등하지 않습니다..");
        }


    }
}
