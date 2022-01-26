package listCollectionPractice.treeMapPractice2.comparableAndComparator1;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample1 {
    public static void main(String[] args) {
        TreeSet<Person> trSet = new TreeSet<>();

        trSet.add(new Person("홍길동", 45));
        trSet.add(new Person("김자바", 25));
        trSet.add(new Person("박지원", 31));

        Iterator<Person> iter = trSet.iterator();
        while (iter.hasNext()){
            Person person = iter.next();
            System.out.println(person.name + ": " + person.age);
        }


    }
}
