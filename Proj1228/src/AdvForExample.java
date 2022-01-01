public class AdvForExample {
    public static void main(String[] args) {

        int[] socres = {9, 7, 8, 9, 8};

        int sum = 0 ;

        for (int s : socres){
            sum += s ;
        }

        System.out.println("sum : " + sum);
    }
}
