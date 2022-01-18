package search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] scores = { 99, 68, 36, 29, 88};

        Arrays.sort(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("scores[%d] = %d\n", i, scores[i]);
        }
        System.out.println();

        // 이진탐색의 조건: 배열이 정렬되어 있어야만 한다.
        // 값이 없으면 음수가 나온다.
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("index: " + index);
    }
}
