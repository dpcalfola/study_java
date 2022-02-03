package opentutorial.setPractice;

import java.util.HashSet;
import java.util.Iterator;

public class ContainsAllPractice1 {
    public static void main(String[] args) {

        HashSet<Integer> hashSetA = new HashSet<>();
        hashSetA.add(1);
        hashSetA.add(2);
        hashSetA.add(3);

        HashSet<Integer> hashSetB = new HashSet<>();
        hashSetB.add(3);
        hashSetB.add(4);
        hashSetB.add(5);


        HashSet<Integer> hashSetC = new HashSet<>();
        hashSetC.add(1);
        hashSetC.add(2);


        System.out.println(hashSetA.contains(1));   //true

        // 부분집합
        System.out.println(hashSetA.containsAll(hashSetA));     //true
        System.out.println(hashSetA.containsAll(hashSetB));     //false
        System.out.println(hashSetA.containsAll(hashSetC));     //true

        // A + B
        hashSetA.addAll(hashSetB);
        // print
        Iterator hi = (Iterator) hashSetA.iterator();
        System.out.println("\nhashSetA: ");
        while (hi.hasNext()){
            System.out.print(hi.next() + " ");
        }

        // A - B
        hashSetA.removeAll(hashSetB);
        // print
        hi = (Iterator) hashSetA.iterator();
        System.out.println("\nhashSetA: ");
        while (hi.hasNext()){
            System.out.print(hi.next() + " ");
        }


        hashSetA.add(1);
        hashSetA.add(2);
        hashSetA.add(3);


        // A 교 B
        hashSetA.retainAll(hashSetB);
        // print
        hi = hashSetA.iterator();
        System.out.println("\nhashSetA: ");
        while (hi.hasNext()){
            System.out.print(hi.next() + " ");
        }






    }


}
