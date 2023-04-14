package review2;

public class ConditionalStatements {
    public static void main(String[] args) {

      /* Conditional statements:  1)if statement   2)switch statement

        1)if statement SYNTAX:
        if (condition) {
         code A
        }
       */

        int age = 18;

        if (age == 18) {
            System.out.println("You can get driver's license.");
        } else {
            System.out.println("You are too young to drive");
        }

        String day = "Thursday";
        if (day.equals("Thursday")) {
            System.out.println("I have a review class");


        }
    }
}
