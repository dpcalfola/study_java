package StringClass;

import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        String tel1 = "   02";
        String tel2 = "  123    ";
        String tel3 = "    4567";

        System.out.println(tel1 + tel2 + tel3);
        System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
        System.out.println();


        // 앞,뒤 공백만 삭제됨
        // 중간 공백은 삭제 안됨
        String str = "     a  b  c";
        System.out.println(str);
        System.out.println(str.trim());

        // 모든 공백이 제거됨 //.replace
        str = str.replace(" ", "");
        System.out.println(str);
    }
}
