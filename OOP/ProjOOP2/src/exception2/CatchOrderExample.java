package exception2;

public class CatchOrderExample {
    public static void main(String[] args) {
        try{
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.printf("%s + %s = %d\n", data1, data2, result);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매가값의 수가 부족합니다.");

            // e 는 객체임

            // 캐치 한 예외 사항을 출력한다.
            // 글자색 빨강
            e.printStackTrace();


            // 혹은 sout. (글자색 흰색)
            System.out.println(e);
            //

        } catch (Exception e) {
            System.out.println("실행에 문제가 있습니다.");
        }finally {
            System.out.println("\n<System> : System is terminated.");
        }

    }
}
