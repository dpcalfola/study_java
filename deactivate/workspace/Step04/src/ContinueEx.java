public class ContinueEx {

    /*
     *
     * 1 부터 100까지 숫자들 중 짝수만 출력
     *
     *
     *
     *
     * */
    public static void main(String[] args) {
//        int total = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 1){
                continue; // 건너뛴다. ( 홀수일때 건너뛰고 for 문으로 다시 돌아간다. )
            }

                System.out.println(i);


        }

    }
}
