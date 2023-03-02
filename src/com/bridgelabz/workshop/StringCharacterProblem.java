package com.bridgelabz.workshop;

import java.util.Scanner;

public class StringCharacterProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = {'A', 'e', 'I', 'O', 'u'};
        StringCharacterProblem problem = new StringCharacterProblem();
        problem.countCharacter(input, chars);
    }

    private void countCharacter(String input, char[] chars) {
        for (char aChar : chars) {
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (String.valueOf(input.charAt(j)).equalsIgnoreCase(String.valueOf(aChar))) {
                    count++;
                }
            }
            System.out.println("Count for character " + aChar + " : " + count);
        }
    }
}
