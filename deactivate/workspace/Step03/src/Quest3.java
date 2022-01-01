public class Quest3 {

    /*
     * 반복문 3개 이용
     *
     *         ********* 9
     *          *******  7
     *           *****   5
     *            ***    3
     *             *     1
     *
     *
     *
     *
     *
     * */

    public static void main(String[] args) {

        int i = 0;
        int j, k;

        while (i < 5) {
            j = 0;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            k = 0;
            while (k < 9 - 2 * i) {

                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }


    }
}
