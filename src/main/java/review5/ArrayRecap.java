package review5;

public class ArrayRecap {
    public static void main(String[] args) {

        String[] languages = {"English", "Russian", "French", "Spanish"};


        for(String lang:languages){
            System.out.println(lang);
        }

        //print in reverse
        System.out.println("--------REVERSE---------");

        for (int i = languages.length-1; i >=0; i--) {
            System.out.print(languages[i] + " ");
        }










    }
}
