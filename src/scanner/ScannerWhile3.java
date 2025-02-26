package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력해주세요(0을 입력하면 종료): ");
            int num = scanner.nextInt();
            if (num == 0) {

                break;
            }
            sum += num;
        }
        System.out.println("사용자의 입력한 모든 정수의 합 : "+sum);
        System.out.println("프로그램을 종료합니다.");
    }
}
