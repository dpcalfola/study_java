package Quiz;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] score = new double[4];
        String[] subject = {"국어", "영어", "수학", "과학"};

        // 입력
        System.out.print("이름을 입력하세요: ");
        String name = scan.nextLine();
        for (int i = 0; i < score.length; i++) {
            System.out.print(subject[i] + " 과목 점수를 입력 하세요: ");
            score[i] = scan.nextDouble();
            if (score[i] < 0 || score[i] > 100) {
                System.out.println("error: " + subject[i] + " 과목");
                System.out.println("점수는 0 이상 100 이하만 입력 할 수 있습니다.");
                i--;
            }
        }
        scan.close();

        // 연산: 총점
        double totalScore = 0;
        for (double d : score) {
            totalScore += d;
        }

        // 연산: 평균
        double avg = totalScore / 4;

        // 출력
        System.out.println();
        System.out.println("< 결과 출력 >");
        System.out.println("=================");
        System.out.println("이름: " + name);
        System.out.println("-----------------");
        for (int i = 0; i < score.length; i++) {
            System.out.println(subject[i] + ": " + score[i]);
        }
        System.out.println("-----------------");
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + avg);
        System.out.println("=================");
    }
}

// 과목 점수가 정수라는 조건이 없어 모든 값을 실수로 입력 받았습니다.