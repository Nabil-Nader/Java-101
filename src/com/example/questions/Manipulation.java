package com.example.questions;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Manipulation {

    public static void main(String[] args) {
        
        String txt= "hella";
//        System.out.println(palindromeChecker(txt));
//        System.out.println(check1(txt));
//        System.out.println(check3(txt));

        findNumberOfVowelStreams(txt);
    }
    
    public static boolean palindromeChecker(String input){
        StringBuilder reverseWorld = new StringBuilder();
        reverseWorld.append(input);
        return input.equalsIgnoreCase(reverseWorld.reverse().toString());
    }

    public static boolean check1(String input){
        byte[] inputArray = input.getBytes();
        byte[] result = new byte[inputArray.length];
        for(int i = 0 ; i <inputArray.length ; i++){
            result[i]=(inputArray[inputArray.length - i - 1]);
        }
        return input.equalsIgnoreCase(new String(result));
    }

    public static boolean check3(String input){
        return IntStream.range(0,input.length()/2)
                .allMatch(i -> input.charAt(i)==input.charAt(input.length()-i-1));
    }





    // find number of vowel and consonants
    public static void findNumberOfVowel(String input){
        int vowelsCount = 0;
        int conostonCount = 0;
        String vowels = "eiouya";
        String normalized = input.toLowerCase().trim();
        char [] normalizedArray = normalized.toCharArray();

        for(char c : normalizedArray) {
            if (vowels.indexOf(c) != -1) {
                vowelsCount++;
            } else {
                conostonCount++;
            }
        }
        System.out.println("number of Vowel ,"+vowelsCount);
        System.out.println("number of conston ,"+conostonCount);
    }

    public static void findNumberOfVowelStreams(String input) {

        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();

        List<Integer> leetters = normalized.chars()
                .filter(Character::isAlphabetic)
                .boxed()
                .collect(Collectors.toList());

        long vowel = leetters.stream()
                .filter(c-> vowels.indexOf(c)!=-1)
                .count();


    }





}
