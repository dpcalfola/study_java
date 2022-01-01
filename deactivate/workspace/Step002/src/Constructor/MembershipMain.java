package Constructor;

public class MembershipMain {

    public static void main(String[] args) {

        Membership m1 = new Membership("Fola@gmail.com", "PW",
                "Fola", 500,
                true, "nonBinary");


        System.out.println(m1.id);
        System.out.println(m1.password);
        System.out.println(m1.name);
        System.out.println(m1.age);
        System.out.println(m1.married);
        System.out.println(m1.gender);


        System.out.println("\n-------- default constructor ------------\n");


        Membership m2 = new Membership();

        System.out.println(m2.id);
        System.out.println(m2.password);
        System.out.println(m2.name);
        System.out.println(m2.age);
        System.out.println(m2.married);
        System.out.println(m2.gender);


        System.out.println("\n-------- constructor ------------\n");


        Membership m3 = new Membership("ttt", "ppp", "fa", 500 , true, "male");


        System.out.println(m3.id);
        System.out.println(m3.password);
        System.out.println(m3.name);
        System.out.println(m3.age);
        System.out.println(m3.married);
        System.out.println(m3.gender);


    }


}
