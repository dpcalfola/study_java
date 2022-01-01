public class Quest1 {

    /*
     * 반복문 중첩을 이용
     *
     *          *
     *          **
     *          ***
     *          ****
     *          *****
     *
     *
     * */


    public static void main(String[] args) {
        int i = 1, j = 1;

        while (i < 6) {

            j=1;

            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }





    }
}
