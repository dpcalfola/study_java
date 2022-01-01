import java.util.Arrays;

public class QuizLotto {
    public static void main(String[] args) {


       // 배열 없이 ?

        int[] arr = new int[6];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random()*45)+1);

        }


        // 버블정렬??
        for (int i = 0; i < arr.length-1; i++) {

            while (arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp ;
            }

        }



//        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                System.out.println("Same Number" + arr[i]);
                arr[i] = (int) ((Math.random()*45)+1);

            }

        }





        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }



    }
}
