package review5;

public class D2Array {
    public static void main(String[] args) {

        String[][] cars = {{"Ford", "Lincoln", "Dodge"},
                {"BMW", "Audi", "Mercedes", "VW", "Fiat"},
                {"Honda", "Toyota", "Subaru", "Nissan"}};


        System.out.println(cars[1][1]);   // Audi

        for (String[] garage : cars) {
            for (String car : garage) {
                System.out.print(car + " ");
            }
        }


    }
}
