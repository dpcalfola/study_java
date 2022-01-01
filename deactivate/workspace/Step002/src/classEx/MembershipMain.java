package classEx;

public class MembershipMain {

    public static void main(String[] args) {
        Membership m1 = new Membership();


        // 회원 클래스 생성 - > 바로 출력
//        System.out.println(m1.id + " " + m1.password + " " + m1.name
//                + " " + m1.age + " " + m1.married + " " + m1.gender);


        m1.id = "fola@gmail.com";
        m1.password = "password";
        m1.name = "Fola";
        m1.age = 500;
        m1.married = true;
        m1.gender = "NonBinary";

        System.out.println(m1.id + " " + m1.password + " " + m1.name
                + " " + m1.age + " " + m1.married + " " + m1.gender);


    }


}
