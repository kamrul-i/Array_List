package com.kamrul.arraylist;
import java.util.Arrays;
public class Array {
    
    public static void main(String[] args) {
        //Sorting in ascending & descending---------------
        int[] number = {10, -9, 45, -14, 68, 2, 0, 12, 20};
        Arrays.sort(number);

        System.out.print("Ascending : ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.printf("\n");

        System.out.printf("Descending : ");
        for (int i = 8; i >= 0; i--) {
            System.out.print(" " + number[i]);
        }

        //Sorting in ascending & descending---------------
        System.out.printf("\n\n");
        String[] names = {"kamrul", "islam", "Habib", "Aslam", "Aahad", "Rumana"};
        Arrays.sort(names);

        for (int i = 0; i < 6; i++) {
            System.out.print(" " + names[i]);
        }
        System.out.printf("\n");

        for (int i = 5; i >= 0; i--) {
            System.out.print(" " + names[i]);
        }
    }
}
