package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단의 단 수를 입력해주세요: ");

        int num = sc.nextInt();
        for (int i = num; i <num+1; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.printf("%d x %d = %d \n",i,j,i*j);
            }

        }
    }
}
