package opentutorial.setPractice;

import java.util.HashSet;
import java.util.Iterator;

public class SetAndIterator1 {
    public static void main(String[] args) {

        HashSet<Integer> a = new HashSet<>();

        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(3);



        Iterator hi = a.iterator();
        while (hi.hasNext()){
            System.out.println("Iterator: " + hi.next());
        }
        System.out.println();


        // 위의 코드를 축약하면 아래처럼 된다 (enhanced for)
        for (Integer integer : a) {
            System.out.println("enhanced for: " + integer);
        }

    }
}
