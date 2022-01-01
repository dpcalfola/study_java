public class ArrayEx2 {

    public static void main(String[] args) {
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5,6};
        int[] arr3 = new int[7]; //int 배열 초기값 : 0

        double[] arr4 = new double[5]; // double 배열 초기값 : 0.0

        boolean[] arr5 = new boolean[5]; //boolean 배열 초기값 : False

        //각각의 배열 출력

        for(int i = 0 ; i<arr1.length ; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for(int i = 0 ; i<arr2.length ; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i<arr3.length ; i++){
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i<arr4.length ; i++){
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        for(int i = 0 ; i<arr5.length ; i++){
            System.out.print(arr5[i] + " ");
        }
        System.out.println();

    }
}


//boolean
// 0 : False
// 0 이 아닌 값 : True