package com.example.letcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));

    }

    public static final boolean isPalindrome(int number){
        if(number<= 0){
            return false;
        }

        /*
            number = 5555
            reverse = 5
            number = 555
            reverse =55
            number = 55
            reverse = 555
         */
        int reverseNumber = 0 ;
        while (number > reverseNumber){
            reverseNumber  =  ( reverseNumber * 10) + (number % 10);
            number /=10;
        }
        return number==reverseNumber || reverseNumber/10 == number;
    }
}
