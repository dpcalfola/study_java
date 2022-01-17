package StringClass;


public class Substring {
    public static void main(String[] args) {
        String ssn = "123456-9876543";

        //0번 인덱스부터 6번 인덱스까지 자른 값을 리턴
        String firstNum = ssn.substring(0, 6);

        // 7번 인덱스부터 끝까지 자름
        String secondNum = ssn.substring(7);

        //출력
        System.out.println("firstNum: " + firstNum);
        System.out.println("secondNum: " + secondNum);


        String str1 = (String) ssn.subSequence(0, 3);
        System.out.println(str1);


        // CharSequence (String 과 비슷하지만 조금 다른 클래스)
        CharSequence cs = "hello world";
        System.out.println(cs);


    }
}
