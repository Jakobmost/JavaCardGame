/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9_3;

/**
 *
 * @author andrea
 */
public class Exercise9_3 {

    /**
     * Exercise 3 from TJ, chapter 9
     * https://books.trinket.io/thinkjava/chapter9.html
     * 
     * The purpose of this exercise is to review encapsulation and generalization.
     * The following code fragment traverses a string and checks whether it has 
     * the same number of open and close parentheses.
     * 
     * 1. Encapsulate this fragment in a method that takes a string argument and returns the final value of count.
     * 2. Now that you have generalized the code so that it works on any string, what could you do to generalize it more?
     * 3. Test your method with multiple strings, including some that are balanced and some that are not.
     */
    public static void main(String[] args) {

        

        String helle = "helle(+2)))";
        
        System.out.println(countP(helle));
        
    }
    
   public static int countP(String word){
       

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            
        }
        return count;
   }
   
   public static boolean isDoubloon(String doubloon){
       
       String lowerdoubloon = doubloon.toLowerCase();
       
       if (lowerdoubloon.length()%2 != 0 ){
           return false;
       }
       
       int count = 0;
       
       for (int i = 0; i < lowerdoubloon.length(); i++) {
            char c = lowerdoubloon.charAt(i);
            
            
            
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            
        }
       
       return false;
   }

}
