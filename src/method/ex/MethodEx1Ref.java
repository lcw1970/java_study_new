package ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        ave(1,2,3);
        ave(15,25,35);
    }
    public static void ave(int a, int b, int c){
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
