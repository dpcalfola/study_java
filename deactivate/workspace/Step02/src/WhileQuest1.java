public class WhileQuest1 {

    /*
     * 1 부터 10 까지 출력하는 반복문 작성
     *
     *
     *
     * */


    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------");


        int j = 1;

        while (true) {

            System.out.println(j);
            j++;

            if (j == 11) break;

        }

    }
}
