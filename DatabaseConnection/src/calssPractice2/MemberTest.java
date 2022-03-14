package calssPractice2;

import org.w3c.dom.DOMImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberTest {
    public static void main(String[] args) {
        System.out.println("Input ename ?");
        Scanner scan = new Scanner(System.in);
        String inp = scan.next();

        System.out.println("inp: " + inp);
        scan.close();


        MemberDAO dao = new MemberDAO();
        ArrayList<MemberVO> list = dao.list(inp);

        for (int i = 0; i < list.size(); i++) {
            MemberVO data = list.get(i);
            String empno = data.getEmpno();
            String ename = data.getEname();
            int sal = data.getSal();

            System.out.println(empno + " : " + ename + " : " + sal);
        }

    }
}
