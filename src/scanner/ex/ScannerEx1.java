package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름은 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.printf("당신의 이름은 %s이고, 나이는 %d살입니다.",name,age);

    }
}
