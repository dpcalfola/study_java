package constructorExplicitCall;

public class Parent {
    private String name;
    private String ssn;

    // getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    Parent(){

    }





    Parent(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
