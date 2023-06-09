package review10;

public class EncapsulationTester {
    public static void main(String[] args) {

        Encapsulation yeska = new Encapsulation("Yeska", "yeska757", "Pass123", "08-21-1993");
        System.out.println(yeska.getDob());
        System.out.println(yeska.getUserName());
        yeska.setUserName("gendosik2");
        System.out.println(yeska.getUserName());





    }
}
