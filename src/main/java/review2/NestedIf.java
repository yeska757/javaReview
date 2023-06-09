package review2;

public class NestedIf {
    public static void main(String[] args) {

        //WHAT: if inside another if
        //WHY: when 1 condition depend on another

     /*
        if(condition){               ------->outer if
                if (condition){      ------->nested if
                }
        }

     */

        boolean driverLicense = true;
        boolean car = true;

        if (driverLicense) {
            System.out.println("Lets check if you have a car");

            if (car) {
                System.out.println("You can drive to work");
            } else {
                System.out.println("You need to take a bus");
            }


        } else {
            System.out.println("You should have drivers license");
        }


    }
}
