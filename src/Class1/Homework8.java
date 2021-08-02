package Class1;

public class Homework8 {
    public static void main(String[] args) {

      /*
      Q1- *Write a method to convert given string into TitleCase

      */
        String titleCaseSent = convertToTitleCase("happy new year TO You DeaR");
        System.out.println(titleCaseSent);




        /*
        Q2- * Write a method to reverse a String
         */

        String revString = reverseString("Happy New Year to you dear!");
        System.out.println(revString);




        /*
        Q3- * Write a method which will return the result, if the given string is a Palindrome
         */
        boolean palWord = palindromeOrNot("mom");
        System.out.println(palWord);





        /*
        Q4- *Write a method to return the average of a given int array
         */
        int []numbers= {7, 10, 3, 6, 10};
        double numAvg= averageOfNumbers(numbers);
        System.out.println(numAvg);




        /*
        Q-5- * Write a method to return the maximum value from a given int array
         */

        int[]arrayNumbers= {33, 54, 67, 19, 9, 52};
        int maxValue= maximumValueInArray(arrayNumbers);
        System.out.println(maxValue);












    }

    /*-
    Q1
     */
    public static String convertToTitleCase(String UserString) {
        String[] userStringSplit = UserString.split(" ");
        String titleCaseSentence = "";
        for (int i = 0; i <= userStringSplit.length - 1; i++) {
            titleCaseSentence += userStringSplit[i].substring(0, 1).toUpperCase() + userStringSplit[i].substring(1).toLowerCase();
            //  System.out.println(titleCaseSent);
        }
        return titleCaseSentence;
    }


    /*
    Q2-
     */
    public static String reverseString(String UserStringToReverse) {
        String reverse = "";
        int length = UserStringToReverse.length();
        for (int c = length - 1; c >= 0; c--) {
            reverse += UserStringToReverse.charAt(c);
        }
        return reverse;
    }


    /*
    Q3-
     */
    public static boolean palindromeOrNot(String UserWord) {
        String palindromeWord = "";
        for (int i = UserWord.length() - 1; i >= 0; i--) {
            palindromeWord += UserWord.charAt(i);
        }
        boolean isPalindrome = true;
        for (int i = 0; i < UserWord.length(); i++) {
            if (UserWord.charAt(i) != palindromeWord.charAt(i)) {
                isPalindrome = false;
            }
            if (isPalindrome) {

            }
        }

        return isPalindrome;
    }




        /*
        Q4-
        */

    public static double averageOfNumbers(int[] UserGivenNumbers) {
        double total = 0;
        for (int n = 0; n < UserGivenNumbers.length; n++) {
            total += UserGivenNumbers[n];
        }
        double average = 0;
        average = total / UserGivenNumbers.length;

        return average;
    }




    /*
    Q-5-
     */

    public static int maximumValueInArray (int[] UserGivenNumbers_2) {
        int maxVal = UserGivenNumbers_2[0];
        for (int i = 0; i <= UserGivenNumbers_2.length - 1; i++) {
            if (UserGivenNumbers_2[i] > maxVal)
                maxVal = UserGivenNumbers_2[i];
        }
        return maxVal;
    }






}

