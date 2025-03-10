package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = sc.nextInt();
        int[] numbers = new int[count];
        System.out.printf("%d개의 정수를 입력하세요: \n",count);
        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }
        int small = numbers[0];
        int big = numbers[0];
        for (int number:numbers) {
            if (number < small) {
                small = number;
            }
            if (number > big) {
                big = number;
            }
        }
        System.out.println("가장 작은 정수: "+small);
        System.out.println("가장 큰 정수: "+big);
    }
}
