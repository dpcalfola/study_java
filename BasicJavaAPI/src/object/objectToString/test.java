package object.objectToString;

import java.util.Date;

public class test {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();

        // obj1의 해시코드 출력
        System.out.println(obj1.toString());
        System.out.println();

        // obj2 date 의 내용
        System.out.println(obj2.toString());
        System.out.println();
    }

}
