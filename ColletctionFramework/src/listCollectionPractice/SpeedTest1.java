package listCollectionPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long timeStart;
        long timeEnd;

        //
        // index 가 0 일때 => 첫자리에 추가
        timeStart = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list1.add(0, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("index 0 : ArrayList  걸린 시간: " + (timeEnd - timeStart) + "ns");


        timeStart = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list2.add(0, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("index 0 : LinkedList 걸린 시간: " + (timeEnd - timeStart) + "ns");

        //
        //index 가 i 일때 => 뒷자리에 추가
        timeStart = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            list1.add(i, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("index i : ArrayList  걸린 시간: " + (timeEnd - timeStart) + "ns");
        timeStart = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            list2.add(i, String.valueOf(i));
        }
        timeEnd = System.nanoTime();
        System.out.println("index i : LinkedList 걸린 시간: " + (timeEnd - timeStart) + "ns");




    }
}
