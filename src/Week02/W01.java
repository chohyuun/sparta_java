package Week02;

import java.util.ArrayList;

public class W01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.set(2, 3);
        System.out.println(list.toString().getClass().getName());
        System.out.println(list.getClass().getName());

        System.out.println(list);
    }
}