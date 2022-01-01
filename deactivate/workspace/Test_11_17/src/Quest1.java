public class Quest1 {

    public static void main(String[] args) {

        System.out.println("1부터 100 사이에 있는 소수는\n");

        int resultNum = 0;
        boolean check = true;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    // 약수가 존재한다.
                    check = false;
                    break;
                }

            }
            if (check) {
                System.out.println(i);
            }
            check = true;

        }

        System.out.println("\n입니다.");


    }
}

