package StringClass;

public class IndexOf {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println("location: " + location);


        if (subject.indexOf("자바") != -1) {
            System.out.println("자바와 관련이 있습니다.");
        } else {
            System.out.println("자바와 관련이 없습니다.");
        }

        // boolean 리턴
        System.out.println(subject.contains("자바"));

        // 파라메터의 값과 동일한 값이 문자열에 존재하지 않을경우 -1 리턴
        System.out.println(subject.indexOf("자바2"));
    }
}
