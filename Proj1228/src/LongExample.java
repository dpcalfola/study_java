public class LongExample {
    public static void main(String[] args) {

        long var1 = 2147483647;
        // L 을 붙이지 않으면 int 변수로 인식한다.
        // long 변수에 넣는 숫자더라도 범위가 4byte를 넘지 않으면 L을 붙이지 않아도 된다
        // 그래도 붙이자;;

        long var2 = 100L;
//        long var3 = 100000000000000000;
        long var4 = 1000000000000000000L;

        System.out.println(var1);
        System.out.println(var2);
//        System.out.println(var3);
        System.out.println(var4);

        System.out.println(Integer.MAX_VALUE);
    }
}
