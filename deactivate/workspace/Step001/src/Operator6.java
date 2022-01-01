public class Operator6 {

    /*
     * 비트 연산자
     *
     * 15 == 1111(2)
     * 10 == 1010(2)
     *
     *
     * */

    public static void main(String[] args) {

        int n1 = 15, n2 = 10;
        System.out.println(n1 & n2); // AND
        System.out.println(n1 | n2); // OR
        System.out.println(n1 ^ n2); // XOR == 캐럿 -> 다를 때 1 출력
        System.out.println(~n2);     // NOT (부호비트가 1이면 값 비트를 뒤집고 1을 더함)

        System.out.println(n2 >> 1); // >> 전체를 2로 나눈 효과
        System.out.println(n2 >> 2);
        System.out.println(n2 >> 3);

        System.out.println(n2 << 1); // << 전체를 2로 곱한 효과
        System.out.println(n2 << 2);
        System.out.println(n2 << 3);


    }
}
