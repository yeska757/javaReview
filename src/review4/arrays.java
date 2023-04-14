package review4;

import java.sql.SQLOutput;

public class arrays {
    public static void main(String[] args) {

        int [] arr = new int[3];
        arr[0]=10;
        arr[1]=11;
        arr[2]=12;

        System.out.println(arr[1]);

        for (int a : arr) {
            System.out.println(a);
        }



        String[]planets= {"Earth", "Mars", "Jupiter", "Saturn", "Neptune"};

        for (int i = 0; i < planets.length; i++) {
            System.out.println(planets[i]);
        }

        //enhanced for loop only with arrays and collections  (iter)

        for (String planet : planets) {
            System.out.println(planet);
        }





    }
}
