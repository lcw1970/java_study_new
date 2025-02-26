package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevale;

        longvalue = intvalue;
        System.out.println("longvale = "+ longvalue);

        doublevale = intvalue;
        System.out.println("double = " + doublevale);

        doublevale = 20L;
        System.out.println("double2= " + doublevale);
    }
}
