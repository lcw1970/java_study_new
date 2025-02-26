package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doublevalue = 1.5;
        int intvalue = 0;

        // intvalue  = doublevalue; 컴파일 오류 발생
        intvalue = (int) doublevalue;

        System.out.println(intvalue);
    }
}
