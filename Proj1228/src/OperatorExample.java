public class OperatorExample {
    public static void main(String[] args) {
        int x = 3 ;
        int y = 4 ;
        int a = 5 , b = 6 ,  c = 7 ;
        int res1 = 0, res2 = 0 ;

        a = b = c = 8;  // ?????????

        // 대입연산자의 방향 : 오른쪽에서 왼쪽으로
        // 참고 : 증감연산자 ++, -- 또한 왼쪽에서 오른쪽으로

        res1 = 100 * 2 + 7 % 5 ;  // 연산자의 갯수는 4개
        res2 = 100 * ( 2 + 7 ) % 5 ;

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(res1);
        System.out.println(res2);


    }
}
