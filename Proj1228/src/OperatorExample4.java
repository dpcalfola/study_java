public class OperatorExample4 {
    public static void main(String[] args) {
        char c1 = 'A' + 1 ;
        char c2 = 'A' ;
        char c3 = (char)(c2+1) ;  // 산출 타입 : int

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);


        int i3 = c2 + 1 ;
        int i2 = c2 ;

        System.out.println("i2 : " + i2);
        System.out.println("i3 : " + i3);


        String str = "Fola" ;

        System.out.println("=========");

        System.out.println(str.charAt(0));

    }
}
