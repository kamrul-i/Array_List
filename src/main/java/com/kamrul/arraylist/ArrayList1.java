package com.kamrul.arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();  //----------(1)

        //Sorting in ascending & descending.
        //add elements to ArrayList
        number.add(1);
        number.add(2);
        number.add(-3);
        number.add(4);
        number.add(4, 5);

        number.add(10);
        number.add(-20);
        number.add(30);
        number.add(-40);
        number.add(9, 50); //----------(2)

        System.out.println("before sorting : " + number);

        Collections.sort(number);
        System.out.println("after sorting is ascending : " + number);

        Collections.sort(number, Collections.reverseOrder());
        System.out.println("after sorting is descending : " + number);
    }
    /*
        Some methods related to ArrayList
        size();
        add();
        remove();
        removeAll();
        clear();
        isEmpty();
        contains();
        index();
        set();
        get();
        equals();
        addAll();
           
    1নং সমীকরণে ArrayList1 এর size নির্ধারণ করে দেওয়া হয় নাই, আপনি যা elements দিবেন, তা auto add হবে।।
    2নং সমীকরণে নির্ধারণ করে দেওয়া হয়েছে, যে এই element -কে এতো নাম্বারে সেট করে দাও।।
        কোনো element কত নাম্বার স্থানে দেখতে চাও, তা নির্ধারণ করে দেওয়া যায়।।
    
    বি.দ্র.: ArrayList নামে same class create করতে পারবেন না।। যদি এখানে সমস্যা না ও করে, তবে app crush করবে।।
    
     */
}
