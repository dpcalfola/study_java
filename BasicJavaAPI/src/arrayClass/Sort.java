package arrayClass;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] scores = { 99, 68, 36, 29, 88};
        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d] = %d\n", i, scores[i]);
        }

        System.out.println();


        String[] names = { "홍길동", "Fola", "flor", "김민수"};

        // 문자열의 정렬 : 알파벳 대문자 > 소문자 > 한글 사전순
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.printf("scores[%d] = %s\n", i, names[i]);
        }




    }
}
