package com.ForestNewark.FizzBuzz;

/**
 * Created by forestnewark on 3/9/17.
 */
public class FizzBuzz {
    /**
     * This method is used to print out a list of integers from a user supplied
     * starting point and ending point.
     * This loop will replace every number that is a multiple of 3 with the String "Fizz".
     * It will replace every multiple of 5 with the String "Buzz".
     * It will replace numbers that are multiples of both 3 and 5 with the String "FizzBuzz".
     *
     * @param start provides starting point for loop
     * @param end   provides ending point for loop
     */
    public static void doIt(int start, int end) {
        //Create a for loop that starts at "start" -int x = start; and will end at "end"
        for (int x = start; x <= end; x++) {
            //First conditional (if) checks to see if a # is a multiple of 3 AND 5
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            //Else if statement checks to see if # is a multiple of 3
            else if (x % 3 == 0) {
                System.out.println("Fizz");
            }
            //Else if statment checks to see if # is a multiple of 5
            else if (x % 5 == 0) {
                System.out.println("Buzz");
            }
            //Else statment prints out the current number (x) only if the number has failed the conditional test above.
            else {
                System.out.println(x);
            }
        }
    }
}
