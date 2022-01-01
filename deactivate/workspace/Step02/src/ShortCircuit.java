public class ShortCircuit {

    public static void main(String[] args) {
        int n1 = 10, n2 = 4;
        boolean result = n1 > 10 && ++n2 > 3; // false n2==4   // 앞쪽에서 논리 연산이 결정되어 버리면 뒤의것은 생략
        result = n1 == 10 || ++n2 > 3; // n2==4 , result == true  // 앞에서 이미 true 이므로 뒷부분은 처리하지 않는다

        // 이를 단락회로라고 부른다.



        // 연산은 순서대로
        // 논리회로가 처리 속도가 느리다. ( 가산기 떄문에 덧셈이 빠르다. )

        System.out.println(n2); // n2 == 4

    }
}
