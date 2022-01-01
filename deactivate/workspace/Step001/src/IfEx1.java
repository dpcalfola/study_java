public class IfEx1 {
    /*
     * 1~100 까지 숫자들 중
     * 3 과 5의 배수를 출력, 공배수는 한번만 출력
     *
     *
     * */

    public static void main(String[] args) {

        System.out.println("3과 5의 공배수를 출력");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }

        }


        for (int i = 1; i <=100 ; i++) {

            if (i%3 == 0){
                System.out.println(i);
            } else if ( i%5 == 0){
                System.out.println(i);
            }

        }


        // for 문 두개 모두 같은 결과
    }
}
