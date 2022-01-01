public class IfQuest {
    /*
     * 1 부터 100까지 숫자들 중
     * 3과 4의 배수를 출력하시오
     * 단 3과 4의 공배수는 한번만 출력
     *
     * */

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if ( i%3 == 0 || i%4==0){
                System.out.println(i);
            }
//
        }
    }
}
