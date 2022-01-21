package listCollectionPractice.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/Jsp");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("총 객체 수: " + size);

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        // 전체 출력
        for (int i = 0; i < list.size(); i++) {
            String str = list. get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();

        // 2번 인덱스 지움 ("Database" 삭제 )
        list.remove(2);
        // object "iBATIS" 삭제
        list.remove("iBATIS");
        // 2번 인덱스 지움 (앞으로 당겨져온 "Servlet/Jsp" 삭제)
        list.remove(2);

        // 전체 출력
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str );

        }
        System.out.println();




    }
}
