package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산 1

        int sum1 = add(5,10);
        System.out.println("결과1 출력: "+sum1);

        // 계산 2
        int sum2 = add(15,20);
        System.out.println("결과2 출력: "+sum2);
    }
    public static int add(int a,int b) {
        System.out.printf("%d + %d 연산 수행\n",a,b);
        int sum = a + b;
        return sum;
    }
}
