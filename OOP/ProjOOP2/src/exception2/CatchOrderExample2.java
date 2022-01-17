package exception2;

public class CatchOrderExample2 {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.printf("%s + %s = %d\n", data1, data2, result);

        } catch (Exception e) {
            System.out.println("실행에 문제가 있습니다.");


            // Exception 레벨 순서가 안맞으면 컴파일 오류.
            // 하위 익셉션이 먼저, 상위 익셉션이 나중에 나와야 한다.
            // Exception e <=== 은 catch 절 마지막에 나와야 한다. ( Exception 의 최 상위 클래스 )
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("실행 매가값의 수가 부족합니다.");



        } finally {
            System.out.println("<System> : System is terminated.");
        }

    }
}
