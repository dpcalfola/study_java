package StringClass;

public class replace {
    public static void main(String[] args) {
        String oldStr = "Java의 가장 큰 특징은 플랫폼에 독립적이라는 것입니다. 1234 Java 1234 Java1 123 1Java";
        System.out.println("oldStr: " + oldStr);
        System.out.println();


        // 단어 단위x 앞뒤로 다른 글자가 붙어 있어도 일괄적으로 교체
        String newStr = oldStr.replace("Java", "자바");
        System.out.println("newStr: " + newStr);
        System.out.println();


        // 새 문자열 없이 기존 문자열에 교체한 문자열을 덮어 씌운다
        oldStr = oldStr.replace("특징은", "feature는");
        System.out.println(oldStr);
        System.out.println();
    }
}
