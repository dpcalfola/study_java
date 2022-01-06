public class Animal {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int PAge) {
        if (age <= 0){
            System.out.println("Input Error");
        }else{
            this.age = PAge ;
        }
    }



    public void setName(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }
}
