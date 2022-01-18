package Quiz.numberBaseBallGame;

import java.util.Scanner;

public class numberBaseballGame3 {
    public static void main(String[] args) {

        // 숫자의 갯수
        int numbers = 3;

        // 변수 선언
        int triNum = 1;
        boolean isCorrect = false;
        int[] userChoice = new int[numbers];
        Scanner scan = new Scanner(System.in);


        // 정답 생성
        int[] answer = new int[numbers];
        makeAnswerArr(answer);

        // ================ 확인 코드 ================ //
//        for (int a : answer) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
        // ================ 확인 코드 ================ //

        // 게임 시작
        while (!isCorrect) {

            // 사용자 번호 입력
            System.out.printf("Try %d: Your numbers? ", triNum++);
            for (int i = 0; i < userChoice.length; i++) {
                userChoice[i] = scan.nextInt();
            }

            // 결과 출력 및 정답 체크, 정답일 경우 반복문 탈출
            isCorrect = printAndIsCorrect(answer, userChoice);
        }

        // 정답 메세지
        printCongratulationsMessage(userChoice, triNum);


    }


    // 정답 메세지 출력기
    private static void printCongratulationsMessage(int[] userChoice, int triNum) {
        System.out.println();
        System.out.println("============= Congratulations!! =============");
        System.out.print(" The answer numbers are ");

        for( int u : userChoice){
            System.out.print(u + " ");
        }

        if (triNum == 2) {
            System.out.println("\n You've gotten answer at once!! Lucky Day!!");
        }else{
            System.out.printf("\n You Won with %d tries\n", triNum-1);
        }

        System.out.println("=============================================");
    }


    // 정답 판독기
    private static boolean printAndIsCorrect(int[] answer, int[] userChoice) {
        int strikeCnt = 0;
        int ballCnt = 0;

        // 스트라이크 체크
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == userChoice[i]) {
                strikeCnt++;
            }
        }

        // 볼 체크
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < userChoice.length; j++) {
                if ((answer[i] == userChoice[j]) && (i != j)) {
                    ballCnt++;
                }
            }
        }

        // 맞았을 경우: 메서드 종료 및 true 리턴
        if (strikeCnt == answer.length) {
            return true;
        }

        // 맞지 않았을 경우: 현황 출력
        System.out.printf("< %d Strike %d Ball >\n\n", strikeCnt, ballCnt);
        return false;
    }


    // 정답 생성기
    private static void makeAnswerArr(int[] answer) {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) Math.floor(Math.random() * 9) + 1;
            for (int j = 0; j < i; j++) {
                if (answer[i] == answer[j]) {
                    i--;
                    break;
                }
            }
        }
    }
}