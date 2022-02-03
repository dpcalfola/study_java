package opentutorial.setPractice;

import java.util.HashSet;
import java.util.Iterator;

public class SetAndIterator2 {
    public static void main(String[] args) {
        // Iterator: 반복자
        // 컨테이너에 담겨진 요소들을 하나하나 꺼내주는 역할

        HashSet<Integer> hashSetA = new HashSet<>();

        hashSetA.add(1);
        hashSetA.add(2);
        hashSetA.add(3);


        Iterator<Integer> hi = hashSetA.iterator();
        // hi 변수는 Iterator 타입이다.

        while (hi.hasNext()){

            // hi 변수 안의 값 1개를 꺼내 출력한다.
            // 꺼내진 값은 hi Iterator 안에서 지워진다
            System.out.println(hi.next());

        }


    }
}
