package listCollectionPractice.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {
        // asList 마우스 오버 해서 설명 볼것
        // 추상리스트 // 고정된 크기 리스트
        List<String> list1 = Arrays.asList("서울시", "중부", "기술", "교육원");

        for ( String name : list1) {
            System.out.print(name + " " );
        }
        System.out.println();

        list1.add(2, "남부"); // Exception


        List<Integer> list2 = Arrays.asList(4,5,8,1,9,12);
        for (int value : list2){
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
