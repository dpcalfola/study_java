package exception;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {

        String data1 = args[0];
        String data2 = args[1];

        if (args.length == 2) {
            System.out.println("args[0]: " + data1);
            System.out.println("args[1]: " + data2);
        } else {
            System.out.println("[How to execute]");
            System.out.println("java ArrayOutOf ");
            System.out.println("value1 value2");
        }

    }
}
