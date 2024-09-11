package DSA.ArrayLists;

import java.util.ArrayList;

public class MultiDArrayList {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        mainList.add(list3);

        //
        for (int i = 1; i <= 5; i++) {
            list.add(i * 1); // 1,2,3
            list2.add(i * 2); // 2,4,6
            list3.add(i * 3); // 3,6,9
        }

        // print 2d array list
        System.out.println(mainList);

        // print every element
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
        }
        System.out.println();
    }
}
