package com.kamrul.arraylist;
import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();  //----------(1)
        ArrayList<Integer> number2 = new ArrayList<>();  //----------(1)
        ArrayList<Integer> number3 = new ArrayList<>();  //----------(1)

        //add elements to ArrayList
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(4, 5); //----------(2)

        number2.add(10);
        number2.add(20);
        number2.add(30);
        number2.add(40);
        number2.add(4, 50); //----------(2)

        //addAll(); in use //number1 এর সকল elements-কে number3-তে add করে দাও।।
        number3.addAll(number1);
        System.out.println("number3 = " + number3);

        //equals(); in use //number1 এর সকল elements-কী number2 এর সমান ??
        boolean result = number1.equals(number2);
        System.out.println("number1 == number2 : " + result);

        //equals(); in use //number1 এর সকল elements-কী number3 এর সমান ??
        result = number1.equals(number3);
        System.out.println("number1 == number3 : " + result);
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
