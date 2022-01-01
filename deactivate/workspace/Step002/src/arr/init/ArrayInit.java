package arr.init;

public class ArrayInit {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        double[] arrDouble = new double[5];
        boolean[] arrBoolean = new boolean[5];
        String[] arrStr = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("int : " + arrInt[i]);

        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("dou : " + arrDouble[i]);

        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("Bool : " + arrBoolean[i]);

        }

        System.out.println();


        for (int i = 0; i < 5; i++) {
            System.out.println("str : " + arrStr[i]);

        }


    }
}
