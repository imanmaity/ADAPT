//Write a program in Java to accept a four-letter word. Display all the probable four letter 
//combinations such that no letter should be repeated in the output within each combination.


import java.util.*;
import java.util.Scanner;

public class KboatStringCombinations {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        String str = in.nextLine();
        int len = str.length();

        if (len != 4) {
            System.out.println("Invalid Input!");
            System.out.println("Please enter a four letter word");
            return;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    for (int l = 0; l < len; l++) {
                        if (i != j && i != k && i != l 
                            && j != k && j != l 
                            && k != l) {
                            System.out.print(str.charAt(i));
                            System.out.print(str.charAt(j));
                            System.out.print(str.charAt(k));
                            System.out.println(str.charAt(l));
                        }
                    }
                }
            }
        }
    }
}
