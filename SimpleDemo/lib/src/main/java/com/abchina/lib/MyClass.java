package com.abchina.lib;

public class MyClass {

    public static void main(String[] agrs){
        System.out.println("----");


        String str = "cbababababababac";
        Solution solution = new Solution();
        String result= solution.longestPalindrome(str);
        System.out.println("result:"+result);
    }
}
