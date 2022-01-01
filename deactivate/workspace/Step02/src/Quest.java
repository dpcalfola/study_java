public class Quest {

    /*
     *
     * 정수형 변수 두개 선언하여 임의의 값으로 초기화를 하고
     * 두 변수 값을 뺄셈을 하였을 때 무조건 양수가 나오게끔 실행
     *
     *
     *
     * */

    public static void main(String[] args) {

        int a = 500, b = 5000;


        int jud = a > b ? a - b : b - a;
        System.out.println(jud);

        int result = a - b;
        System.out.println(-Math.abs(result));
    }


}
