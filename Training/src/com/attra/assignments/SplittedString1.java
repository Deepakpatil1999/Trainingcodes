package com.attra.assignments;



public class SplittedString1 {



   public static void main(String[] args) {
        String str = "Bangalore";



//        String reverse = "";
//        for (int a = 0; a < str.length(); a++) {
//            reverse = str.charAt(a) + reverse;
//        }
//
//        System.out.println(reverse);



       String hyphenStr = "";
        int len=str.length()-1;
        for (int a = 0; a < str.length(); a++) {
            hyphenStr = hyphenStr + str.charAt(a);
            if ((a + len) % 4 == 0) {



               hyphenStr = hyphenStr + "-";
            }
        }



       System.out.println(hyphenStr);



   }
}