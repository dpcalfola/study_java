public class OperatoprExample4 {
    public static void main(String[] args) {
        int x = 5 ;
        int y = 8 ;
        int result1 = ++x + 10 ; // 16
        int result2 = y++ + 10 ; // 18

        System.out.println(x); //6
        System.out.println(y); //9
        System.out.println(result1); //16
        System.out.println(result2); //18
    }
}
