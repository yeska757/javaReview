package review6;

public class ColdStone {
    public static void main(String[] args) {

        IceCream iCream = new IceCream();
        iCream.flavor = "Vanila";
        iCream.color = "white";
        iCream.dairyFree = false;
        iCream.price = 2.99;

        iCream.eat();
        iCream.buy();

        IceCream myIcream = new IceCream();
        myIcream.flavor = "Snickers";
        myIcream.color = "white/brown";
        myIcream.dairyFree = false;
        myIcream.price = 4.20;

        myIcream.eat();
        myIcream.buy();





    }
}
