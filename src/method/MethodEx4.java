package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true){
            start();
            System.out.print("선택: ");
            int select_menu = sc.nextInt();

            if (select_menu == 1){
                System.out.print("입금액을 입력하세요: ");
                int amount = sc.nextInt();
                balance = deposit(balance,amount);
            }
            else if (select_menu == 2){
                System.out.print("출금액을 입력하세요: ");
                int amount = sc.nextInt();
                balance = withdraw(balance, amount);
            }
            else if (select_menu == 3) {
                check(balance);
            }
            else if (select_menu == 4){
                exit();
                break;
            }
            else {
                System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }
        sc.close();
    }
    public static void start() {
        System.out.println("-------------------------------------");
        System.out.println("1.입금 | 2.출금 | 3. 잔액확인 | 4. 종료");
        System.out.println("-------------------------------------");
    }
    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount+"원을 입금하였습니다. 현재 잔액: "+balance);
        return balance;
    }
    public static int withdraw(int balance, int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount+"원을 출금하였습니다. 현재 잔액: "+balance);
            return balance;
        }
        else {
            System.out.println(amount+"원을 출금하려 헀으나 잔액이 부족합니다.");
            return balance;
        }
    }
    public static void check(int balance){
        System.out.println("현재 잔액: "+balance);
    }
    public static void exit() {
        System.out.println("시스템을 종료합니다.");
    }
}
