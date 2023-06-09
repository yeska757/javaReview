package review10;

import java.util.ArrayList;

public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<String> amazonList=new ArrayList<>(10000000);

        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            amazonList.add(String.valueOf(i));
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
