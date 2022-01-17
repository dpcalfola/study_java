package StringClass;

public class Split {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-Simon";

        String[] names = text.split("&|,|-");
        // | <=== 또는
        // | <=== 앞뒤로 반드시 붙여써야함. 공백도 인식하기 때문
        // "&|,|-" (o)
        // " & | , | -" (x)
        //


        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.length);
    }
}
