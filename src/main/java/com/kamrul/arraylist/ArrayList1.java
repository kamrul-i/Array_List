package com.kamrul.arraylist;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();  //----------(1)

        System.out.println("arraylist size : " + number.size());
        System.out.printf("\n");

        //add elements to ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50); //----------(2)
        
        //if you want 1 contains find -----------------
        int x = number.get(1);
        System.out.print("1 no index is in the list = " + x);

        System.out.printf("\n\n");

        //if you want 1 contains find -----------------
        boolean contains = number.contains(40);
        System.out.println("40 is in the list ? " + contains);
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
