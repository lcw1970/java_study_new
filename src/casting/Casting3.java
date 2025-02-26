package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값
        long maxIntOver = 21147383648L;

        int intValue =0;
        intValue = (int) maxIntValue;
        System.out.println("maxIntValue : " +intValue);

        intValue = (int) maxIntOver;
        System.out.println("maxIntOver : " +intValue );
    }


}
