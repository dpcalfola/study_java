package StringClass;

public class ValueOf {
    public static void main(String[] args) {
        int i = 19;
        double d = 10.8;
        boolean b = true ;

        String str1 = String.valueOf(i);
        String str2 = String.valueOf(d);
        String str3 = String.valueOf(b);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //문자열끼리 덧셈 가능
        System.out.println(str1+str2+str3);
    }
}
