package StringClass;

import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args) {
        String text = "홍길동/이수홍/박연수,Fola";

        StringTokenizer st = new StringTokenizer(text, "/|,");

        int cntTokens = st.countTokens();

        System.out.println("cntTokens: " + cntTokens);
        System.out.println();

        for (int i = 0; i < cntTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
            int cnt = st.countTokens();
            System.out.println("cntTokens: " + cnt);
        }
        System.out.println();

        st = new StringTokenizer(text, "/|,");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }


    }
}
