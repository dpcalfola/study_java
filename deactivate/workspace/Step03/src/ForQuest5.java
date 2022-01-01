public class ForQuest5 {
    /*
    * 구구단 2단부터 9단까지 출력 (for)
    * */

    public static void main(String[] args) {
        for(int i = 2 ; i<10 ; i++){
            System.out.println("\n" + i + "단");
            for ( int j = 1 ; j <10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
