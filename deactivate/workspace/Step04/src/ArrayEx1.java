public class ArrayEx1 {

    /*
    *   배열(Array)
    *       변수명 하나로 데이터를 여러개 저장하는 방법
    *       여러개의 데이터를 특정하기 위해서 인덱스라는 번호표를 이용
    *
    *
    *
    * */
    public static void main(String[] args) {

        int[] arr = new int[5];
        // 길이가 5개짜리인 배열 선언

        arr[0] = 10 ;
        arr[1] = 20 ;
        arr[2] = 30 ;
        arr[3] = 40 ;
        arr[4] = 50 ;


        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);



    }
}
