import java.util.Scanner;

public class ForQuest4 {

    /*
     *
     * 숫자 0을 입력 할때까지 입력을 받고
     * 0을 입력하면 더이상 입력 받지 않고
     * 입력한 숫자들의 총합을 출력
     *
     *
     * */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input = -1 ;
        int sum = 0;

        for(;input!=0;){
            input = scan.nextInt();
            sum += input ;

        }

        scan.close();

        System.out.println(sum);


    }
}
