package mainThreadPractice;

public class ThreadTest01 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("thread");
            try {
                // 1000ms == 1sec
                // Thread.sleep <== try catch 문을 작성해야 컴파일 에러가 나지 않는다
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
}
