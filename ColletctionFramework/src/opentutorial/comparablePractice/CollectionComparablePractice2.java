package opentutorial.comparablePractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionComparablePractice2 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};


        // 사전순 정렬, 대문자가 소문자에 우선한다(아마도 아스키코드에 의하여)
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        // 사전순 정렬, 대소문자 구분 없이
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strArr));

        // 역순 정렬
        Arrays.sort(strArr, new Descending());
        System.out.println(Arrays.toString(strArr));

    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        if( o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
            // 또는
//             return c2.compareTo(c1);
        }
        return -1;
    }
}
