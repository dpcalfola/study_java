import javax.xml.transform.Source;

public class WhileQuest3 {
    /*
     *
     * 1 부터 100 까지 합을 출력하시오
     *
     *
     *
     * */

    public static void main(String[] args) {

        int n = 1;
        int sum = 0;
        while (n <= 100) {

            sum += n;
            n++;
//            System.out.println(sum);

        }
        System.out.println(sum);

    }
}
