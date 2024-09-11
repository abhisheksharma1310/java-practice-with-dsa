package DSA.ArrayLists;

import java.util.ArrayList;

public class MostWater {
    public static void findMostWater(ArrayList<Integer> heightList) {
        int maxWater = 0;
        // brute force - O(n^2)
        for (int i = 0; i < heightList.size(); i++) {
            for (int j = i + 1; j < heightList.size(); j++) {
                int currHeight = Math.min(heightList.get(i), heightList.get(j));
                int width = j - i;
                int currWater = currHeight * width;
                if (currWater > maxWater) {
                    maxWater = currWater;
                }
            }
        }
        System.out.println(maxWater);

        // two pointer - O(n)
        int lp = 0;
        int rp = heightList.size() - 1;

        while (lp < rp) {
            // calculate water area
            int ht = Math.min(heightList.get(lp), heightList.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            // update ptr
            if (heightList.get(lp) < heightList.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        System.out.println(maxWater);
    }

    public static void main(String args[]) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ArrayList<Integer> heightList = new ArrayList<>();

        for (int i = 0; i < height.length; i++) {
            heightList.add(height[i]);
        }

        findMostWater(heightList);
    }
}