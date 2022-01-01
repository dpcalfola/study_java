public class WhileInWhile {

    public static void main(String[] args) {

        int dan = 2, is = 1 ;

        while (dan < 10) {
            is = 1 ;
            System.out.println("\n" + dan + "단 시작 ");
            while (is<10){
                System.out.println(dan + " * " + is + " = "+ dan*is );
                is++;
            }
            dan++ ;
        }

    }
}
