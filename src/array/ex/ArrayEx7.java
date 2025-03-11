package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] scores = {"국어","영어","수학"};

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번 학생의 성적을 입력하세요:\n",i+1);
            for (int j = 0; j <3; j++) {
                System.out.printf("%s 점수: ",scores[j]);
                int score = sc.nextInt();
                students[i][j] = score;
                }
            }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            double ave = 0;
            for (int j = 0; j < 3; j++) {
                total += students[i][j];
            }
            ave = (double) total / 3;

            System.out.printf("%d번 학생의 총점: %d, 평균: %f\n",i+1,total,ave);
        }
        }
    }

