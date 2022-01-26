package listCollectionPractice.treeMapPractice2;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HashTableExample5 {
    public static void main(String[] args) {
        TreeMap<String, Integer> trMap = new TreeMap<>();
        trMap.put("coke", 10);
        trMap.put("forever", 60);
        trMap.put("description", 40);
        trMap.put("ever", 50);
        trMap.put("zoo", 10);
        trMap.put("base", 20);
        trMap.put("guess", 70);
        trMap.put("cherry", 30);

        System.out.println("[c-f 사이의 단어 검색]");
        NavigableMap<String, Integer> rangeMap = trMap.subMap("c", true, "f", true);
        for(Map.Entry<String, Integer> entry : rangeMap.entrySet()){
            System.out.printf("%s-%d페이지\n", entry.getKey(), entry.getValue());
        }
        System.out.println();

    }

}
