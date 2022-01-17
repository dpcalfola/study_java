package exception2.throws1;

public class ThrowsExample {
    public void excetionMethod() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();



        try{
            te.excetionMethod();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
