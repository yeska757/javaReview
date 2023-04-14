package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed = true;
        boolean loginClickable = true;

        if (loginClickable && loginButtonDisplayed) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
    }