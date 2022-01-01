public class Quest2 {

    /*
     * 반복문 3개 이용
     *
     *             *
     *            **
     *           ***
     *          ****
     *         *****
     *
     *
     *
     *
     *
     * */

    public static void main(String[] args) {
        int i = 0;
        int j ;
        int k ;

        while (i < 6) {
            j = 4;
            while (j >= i) {
                System.out.print(" ");
                j--;
            }
            k = 1;
            while (k <= i) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
