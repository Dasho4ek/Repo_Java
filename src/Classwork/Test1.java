package Classwork;

public class Test1 {
    public static void main(String[] args) {

        /*
        Q1-
         */
        ticketSystem();

        /*
        Q2-
         */













    }

    /*
    Q1-
     Scenario: Traffic ticketing system
         * Write a method, that will print (not return) the points to be charged against
         * the license for over speeding.
         *
         *    1. Speed Limit = 70
         *    2. Every 5 miles over the speed limit will add 1 point
         *    3. If user speed is such that system shows 12 points for a speed
         *      then print, license is suspended
         *
         *  Example:
         *      user speed = 74 ; 0 points
         *      user speed = 78 ; 1 points  // 70-75(1) 75-78(0) = 1
         *      user speed = 88 ; 3 points  // 70-75(1) 75-80(1) 80-85(1) 85-88(0) = 3
         *      user speed = 178 ; 21 points (License suspended).
         *      user speed = 70 ; Thank you for driving within the speed limit.
         *
     */

    public static void ticketSystem() {
        int speedLimit = 70;
        int[] mySpeed = {70, 74, 78, 88, 178};
        for (int i = 0; i < mySpeed.length; i++) {
            if (mySpeed[i]< 74) {
                System.out.println("Your speed is " + mySpeed[i] + " you got 0 points");
                {
                    if (mySpeed[i] >= 78) {
                        System.out.println("Your speed is " + mySpeed[i] + " you got 1 point");
                    } else if (mySpeed[i] >= 88) {
                        System.out.println("Your speed is " + mySpeed[i] + " you got 3 points");
                    } else if (mySpeed[i] >= 178) {
                        System.out.println("Your speed is " + mySpeed[i] + " your licence is suspended");
                    } else if (mySpeed[i] == speedLimit)
                {System.out.println("Thank you for driving within the speed limit.");
                }
                }
            }


        }
    }

    /*
     * Question 2:
     * Create a method to return an int-array
     * after removing a given int-value from a given int array.
     *
     * Input array: {32, 14, 24, 98, 24, 56, 148, 24, 78, 24}    Input Number: 24
     * Returned array: {32, 14, 98, 56, 148, 78}
     *
     * Input array:     {1, 2, 4, 3, 1, 6, 1}    Input Number: 11
     * Returned Array:  {1, 2, 4, 3, 1, 6, 1}
     */


    public static int[] removeValue (int[] userArray, int inputNumber){
        int[]returnedArray= {0};
        for (int i=0; i< userArray.length; i++){


        }
    }














}
