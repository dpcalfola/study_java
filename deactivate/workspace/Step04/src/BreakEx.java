public class BreakEx {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        while (true) {

            total += i;
            i++;

            if (total > 5000) {
                break; // break 를 감싸고 있는 반복문 하나를 강제 종료한다. ( 반복문을 빠져나온다. )
                       // break 는 반드시 if 문이랑 같이 쓰인다.
            }


        }
        System.out.println(total);
        System.out.println(i);
    }
}
