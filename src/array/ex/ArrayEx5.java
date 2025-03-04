package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int num1 = sc.nextInt();

        int[] numbers = new int[num1];
        int sum = 0;
        System.out.println("3개의 정수를 입력하세요:");
        for (int i = 0; i < num1; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / num1;

        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+average);
    }
}
