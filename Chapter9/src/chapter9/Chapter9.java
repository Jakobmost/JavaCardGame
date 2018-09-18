/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

import java.util.ArrayList;

/**
 *
 * @author andrea
 */
public class Chapter9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String fruit = "banana";
        char letter = fruit.charAt(0);
        System.out.println("the first letter is " + letter); // char + string => string


        /* a char can represent any UNICODE symbol
           http://unicode.org/
         */
        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        ///////////////////////
        // Traverse a string
        ///////////////////////
        System.out.println("Traverse a string");
        for (int i = 0; i < fruit.length(); i++) {
            char aLetter = fruit.charAt(i);
            System.out.println(aLetter);
        }

        // Strings are immutable -> you cannot CHANGE a string, just make a new one
        String name = "Alan Turing";
        String theName = name.toUpperCase();
        System.out.print("before:" + name); // notice: this one has not changed!
        System.out.println("... and after:" + theName);

        // replace substrings
        String text = "Computer Science is fun! So, remember: Computer Science!!";
        text = text.replace("Computer Science", "CS"); // changes the string everywhere!
        System.out.println("After replacing: " + text);

        /////////////////////////////////////////////////////////////////
        // Substring and indexOf
        /////////////////////////////////////////////////////////////////        
        System.out.println("all characters but the first 2 = " + fruit.substring(2));
        // substring is overloaded, you can also use it like this: string.substring(from,to)
        System.out.println("characters from index 2 to 5 = " + fruit.substring(2, 5));

        // Where are the 'a's in banana? IndexOf
        // -1 means "not found"
        System.out.println("The first 'a' is found at index " + fruit.indexOf('a'));
        System.out.println("The first 'Z' is found at index " + fruit.indexOf('Z'));
        // How can we look for the other 'a's? ... TO DO

        ////////////////////////////////////////////
        // Many string traversals involve reading one string and creating another. 
        ////////////////////////////////////////////
        System.out.println(fruit + " becomes => " + reverse(fruit));
        int howMany = countVowels("Super Mario Bros");  // -> 6 vowels
        System.out.println("\"Super Mario Bros\" has exaclty " + howMany + " vowels.");

        /////////////////////////////////////////
        // Compare strings
        /////////////////////////////////////////
        System.out.println("\n////////////Compare strings////////////");
        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace"; // try with "Alan Turing"
        if (name1 == name2) {                 // wrong!
            System.out.println("The names are the same.");
        }

        // the correct way!
        if (name1.equals(name2)) {
            System.out.println("The names are the same.");
        }
        
        // compareTo checks the alphabetical order
        int diff = name1.compareTo(name2);
        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.println("name1 comes before name2.");
        } else if (diff > 0) {
            System.out.println("name2 comes before name1.");
        }
        
        //////////////////////////////
        // String.format example
        //////////////////////////////
        String abc = String.format("%02d:%02d %s", 12, 3, "PM");
        System.out.println("\nThe time is "+abc);
        
        //////////////////////////////
        // Wrapper classes
        //////////////////s////////////
        String str = "129";
        int num = Integer.parseInt(str);
        System.out.println("\nThe number times 10 is "+num*10);
        
        String str2 = Integer.toBinaryString(num);
        System.out.println("And as a binary number it looks like this: "+str2);
        
        


        ////////////////////////////////////////////
        // And a simple ArrayList
        ///////////////////////////////////////////
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // empty list of numbers
        System.out.println(numbers + " size: " + numbers.size());
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers + " size: " + numbers.size());
        
        int second = numbers.get(1);
        System.out.println("second element is " + second);
        System.out.println(numbers + " size: " + numbers.size());
        
        numbers.remove(1); 
        System.out.println("After removing the second element, " +numbers + " size: " + numbers.size());
    }

    /**
     * A typical traversal method for strings
     *
     * @param s the original string
     * @return a copy of the string, reversed
     */
    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static int countVowels(String text) {
        String vowel = "AEIOU";
        String s = text.toUpperCase();
        int total = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            // convert a char into a string
            String currentChar = "" + s.charAt(i);

            // if vowel string does contain this char, then it is a vowel
            if (vowel.indexOf(currentChar) != -1) {
                total++;
            }

        }
        return total;
    }
}
