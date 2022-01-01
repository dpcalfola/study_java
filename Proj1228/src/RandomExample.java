public class RandomExample {
    public static void main(String[] args) {

        int ranNum;


        for (int i = 0; i < 100; i++) {
            ranNum = (int) (Math.random() * 3);
            System.out.print(ranNum + " ");
        }

        System.out.println("===================");

        for (int i = 0; i < 100; i++) {
            ranNum = (int) (Math.floor(Math.random() * 3));
            System.out.print(ranNum + " ");
        }





    }
}
