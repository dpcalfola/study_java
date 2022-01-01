public class IfEx3_1 {

    /*
     *
     *    XY
     *  + YX
     * ----------
     *    99
     *
     * 0<X<9
     * 0<Y<9
     *
     *
     * */

    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {

                if (x + y == 9) {
                    System.out.println("X=" + x + " Y=" + y);
                    break;
                }


            }

        }

    }
}

