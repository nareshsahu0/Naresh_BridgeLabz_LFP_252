package com.bridgelabz.assignments.day5;

import java.util.HashSet;
import java.util.Scanner;

public class VowelsOrConsonants {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character");
        char alphabet = in.next().charAt(0);
        alphabet = Character.toLowerCase(alphabet);
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        if (vowels.contains(alphabet)) {
            System.out.println(alphabet + " is a vowel");
        } else {
            System.out.println(alphabet + " is a consonant");
        }

    }
}
