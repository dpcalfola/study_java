package Constructor;

public class Membership {

    String id;
    String password;
    String name;
    int age;
    boolean married;
    String gender;

    public Membership(String id, String password, String name, int age, boolean married, String gender) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.married = married;
        this.gender = gender;
    }
//    Membership (String id2, String password2, String name2, int age2,
//                boolean married2, String gender2 ){
//        id = id2;
//        password = password2;
//        name = name2 ;
//        age = age2;
//        married = married2;
//        gender = gender2 ;
//    }




    Membership(){

    } // Default Constructor

}
