package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu_select = sc.nextInt();
            sc.nextLine();
            if (menu_select == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (menu_select == 1) {
                if (productCount <10 ){
                    System.out.print("상품 이름을 입력하세요:");
                    String name = sc.nextLine();

                    System.out.print("상품 가격을 입력하세요:");
                    int price = sc.nextInt();

                    productNames[productCount] = name; // 입력 받고 상품을 추가
                    productPrices[productCount] = price;

                    productCount += 1;
                }
                else {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }

            }
            else if (menu_select == 2){
                if (productCount != 0){
                    for (int i = 0; i < productCount; i++) {
                        System.out.printf("%s: %d원",productNames[i],productPrices[i]);

                    }
                }
                else {
                    System.out.println("등록된 상품이 없습니다.");
                }
            }
            else {
                System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        }
    }
}
