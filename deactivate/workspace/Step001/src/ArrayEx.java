public class ArrayEx {
    /*
     * 정수형 배열 길이가 10인 배열을 생성 후
     * 배열에 모든 값을 입력 받은 후
     * 짝수의 개수를 출력
     *
     *
     *
     * */
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                count++;
            }
        }


        System.out.println("----------------");


        System.out.println("짝수의 개수는 " + count + " 개 입니다");
    }
}
