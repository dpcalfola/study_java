public class CharExample {
    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 65 ;
        int i1 = 65 ;


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(i1);

        // 형식 지정자 : %d -> 정수
        // 형식 지정자 : %c -> character

        System.out.println("================================");

        System.out.printf("%d\n", (int)c2);
        System.out.printf("%c\n", c2);


    }
}
