package com.kamrul.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();  //----------(1)

        System.out.println("arraylist size : " + number.size()); //----------(4)
        System.out.printf("\n");

        //add elements to ArrayList
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4, 50); //----------(2)
        
        //print [iterator system]
        Iterator itr = number.iterator();
        while (itr.hasNext()) {
            System.out.print(" " + itr.next());  //----------(3)
        }
        System.out.printf("\n");
        System.out.print("arraylist size : " + number.size());
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
           
    1নং সমীকরণে ArrayList এর size নির্ধারণ করে দেওয়া হয় নাই, আপনি যা elements দিবেন, তা auto add হবে।।
    2নং সমীকরণে নির্ধারণ করে দেওয়া হয়েছে, যে এই element -কে এতো নাম্বারে সেট করে দাও।।
        কোনো element কত নাম্বার স্থানে দেখতে চাও, তা নির্ধারণ করে দেওয়া যায়।।
    3নং সমীকরণের এ line ব্যবহার করলে elements কি কি আছে, তা result এ show করে।।
    4নং সমীকরণকে প্রথমেই print করে দেখানো হয়েছে, তার আগে কোন কাজ করা হয় নাই এবং ফলাফল শূন্য দেখানো হয়েছে।।
        array declare করার পর print করলে result show করবে।।
    
    বি.দ্র.: ArrayList নামে same class create করতে পারবেন না।। যদি এখানে সমস্যা না ও করে, তবে app crush করবে।।
    
     */
}
