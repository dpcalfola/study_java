package StringClass;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("java ");
        sb.append("Program Study");
        System.out.println(sb.toString());

        sb.insert(4, "2");
        System.out.println(sb.toString());


        // 문자열에서 주어진 index의 문자를 다른 문자로 대치
        sb.setCharAt(4,'6');
        System.out.println(sb.toString());

        sb.replace(6,13,"book");
        System.out.println(sb.toString());

        sb.delete(4,5);
        System.out.println(sb.toString());

        // sb.toString <=== 안해도 됨. 그냥 sb 로 출력 가능
        System.out.println(sb);

        int length = sb.length();
        System.out.println("총 문자수: " + length);

        String result = sb.toString();
        System.out.println(result);

    }
}
