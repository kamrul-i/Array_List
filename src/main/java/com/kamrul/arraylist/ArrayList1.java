package com.kamrul.arraylist;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();  //----------(1)

        System.out.println("arraylist size : " + number.size()); //----------(3)
        System.out.printf("\n");

        //add elements to ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50); //----------(2)
        
        //replace any element 
        number.set(3, 60); //----------(3)
        System.out.print("after setting element = " + number);
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
    3নং সমীকরণে দেখানো হয়েছে, এই element কে ৩নং element-এ replace করে দাও।।
    
    বি.দ্র.: ArrayList নামে same class create করতে পারবেন না।। যদি এখানে সমস্যা না ও করে, তবে app crush করবে।।
    
     */
}
