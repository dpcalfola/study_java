public class DoWhile {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Hello World");
            i++ ;
        }while (i<1);

        /// do while : do 를 먼저 하고 while 조건식 판별
        /// do while : 최소 한번의 do 실행은 보장한다.


        System.out.println("---------------");

        int j = 0 ;
        while (j<5) {
            System.out.println("world hello");
            j++;
        }
    }
}
