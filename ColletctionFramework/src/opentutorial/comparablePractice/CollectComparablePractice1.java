package opentutorial.comparablePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectComparablePractice1 {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphittie"));

        Iterator<Computer> i = computers.iterator();
        System.out.println("before");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();


        Collections.sort(computers);

        System.out.println("after");
        i = computers.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

// implements 사전 의미: 도구
class Computer implements Comparable {

    int serial;
    String owner;

    public Computer(int serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }


    public String toString() {
        return this.serial + " " + this.owner;
    }

    @Override
    public int compareTo(Object o) {
        return this.serial - ((Computer) o).serial;
    }
}

