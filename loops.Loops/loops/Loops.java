/*
 * Program: Loops.java
 * Student: Lydia Frame 
 * Purpose: A program that counts to 10 in a while loop then counts to 10 in a for loop.
*/
package loops; 

import java.util.Scanner; 

public class Loops{
    public static void main(String[] args){
        //Variables
        int count = 0;
        int i = 1;
        int j;
        int k = 1;

        //While loop
        while (count < 10){
            System.out.println("While loop " + i);
            count++;
            i++;
        }

        //For loop
        for (j = 0; j < 10; j++){
            System.out.println("For loop " + k);
            k++; 
        }

    }
}