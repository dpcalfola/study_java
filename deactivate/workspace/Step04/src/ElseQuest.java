import java.util.Scanner;

public class ElseQuest {

    /*
    * 숫자 두개 입력을 받고
    * 두 숫자의 뺄셈 결과가 무조건 양수가 나오게끔 처리
    *
    * */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 ");
        int a = scan.nextInt();
        System.out.print("두번째 숫자를 입력하세요 ");
        int b = scan.nextInt();

        scan.close();

//        System.out.print("두수의 차의 절대값은 ");
//
//        if(a>=b){
//            System.out.print(a-b);
//        }else{
//            System.out.print(b-a);
//        }
//
//        System.out.print(" 입니다\n");
//
//
//        System.out.println("\n<Math.abs 사용>");
//
//
//        System.out.println("두수의 차의 절대값은 " + Math.abs(b-a) + " 입니다.") ;
//
//
//        System.out.println("-------------------");


//        int c = a-b ;
//        if(c<0){
//            c= -c;
//
//        }
//
//        System.out.println(c);

        if(a<b){
            int temp;
            temp = a ;
            a = b ;
            b = temp;
        }


        System.out.println(a-b);





    }
}
