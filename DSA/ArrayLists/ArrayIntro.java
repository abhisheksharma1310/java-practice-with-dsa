package DSA.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayIntro {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add ement in array - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // print arraylist
        System.out.println(list);

        // get element from array - O(1)
        System.out.println(list.get(1));

        // remove element - O(n)
        list.remove(2);
        System.out.println(list);

        // modify alement - O(n)
        list.set(2, 10);
        System.out.println(list);

        // check element - O(n)
        System.out.println(list.contains(11));
        System.out.println(list.contains(10));

        // insert element at given index - O(n)
        list.add(2, 3);
        System.out.println(list);

        // size of arrayList
        System.out.println(list.size());

        // iterate over arrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print reverse of an arrayList
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // find maximum in array list
        int maxNum = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            // if (temp > maxNum) {
            // maxNum = temp;
            // }
            maxNum = Math.max(maxNum, temp);
        }
        System.out.println("max: " + maxNum);

        // swap two number
        // index = 1 and 3
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
        System.out.println(list);

        // sort the array in ascending order
        Collections.sort(list);
        System.out.println(list);

        // sort the array in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
