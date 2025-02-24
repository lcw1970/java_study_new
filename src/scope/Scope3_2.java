package scope;
// scope를 사용하는 이유는 불필요한 메모리 소모를 줄이기위함, 효율적인 코드를 만들기 위함이다.

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        if (m >0){
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " +m);
    }
}
