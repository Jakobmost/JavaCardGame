/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author anva
 */
public class Chapter7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // https://en.wikipedia.org/wiki/Logistic_map
        // Population with max 1 (100%); r is the reprodution parameter
        // r = 2.7   in interval [0,4]
        // x_0 = 0.02      -> population in percentage = 20%
        // x_t+1 = r * x_t *( 1 - x_t )
        //////////////////////////////////////////////////
        // LET'S MAKE A TABLE FOR THIS FUNCTION!

        int t = 0;
        double x = 0.02; // try with 0.01 or 0.55, or 0.96
        double r = 2; // try 2 -> fixed point; try 3.0 -> 2 points; 3.5 -> period 4
        while (t < 50) {
            double xNext = r * x * (1 - x);
            x = xNext;

            System.out.printf(" %3d -> %1.8f \n", t, x);

            t = t + 1;
        }

        // As a for-loop
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>");
        x = 0.02;   // try with 0.01 or 0.55, or 0.96
        r = 2;      // try 2 -> fixed point; try 3.0 -> 2 points; 3.5 -> period 4
        for (int i = 0; i < 50; i++) {
            double xNext = r * x * (1 - x);
            x = xNext;
            System.out.printf("\t %3d -> %1.8f \n", i, x);
        }
        System.out.println("<+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+><+>");

        howBigATable(10,20);
    }
 ///////////////////////////////////////////////////////////////////////
        // Encapsulation and generalization -> printing multiplication tables

    public static void howBigATable(int min, int length) {
        for (int i = min; i<=length; i++){
            table(i);
        }
    }
        
        /* The result should be
        1   2   3   4   5   6   7   8   9  10
        2   4   6   8  10  12  14  16  18  20
        ...
        10  20  30  40  50  60  70  80  90 100
        */
    public static void table(int startNo) {
               
        // start printing 1 line ...
        int j = 1;
        while (j <= 10) {
            System.out.printf("%4d", startNo * j);
            j = j + 1;
        }
        System.out.println();

        // now let's print another line, but first: make a method!
        // then use a for-loop to print all lines
        // finally: put also the for-loop into a static method
        
        // --- TO DO ------------------------------------------------
    }

}
