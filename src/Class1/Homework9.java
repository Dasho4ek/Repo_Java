package Class1;

import java.util.ArrayList;

public class Homework9 {
    public static void main(String[] args) {

        /*
         * Q1-  Count the words which contains "happy" in the given array.
         */


        String[] arrayOfStrings= {"happy holidays" , "how are you", "have a happy vacation", "happyness is the key" , "I want happiness for you" };
        String word= "happy";
        String[] myWords= countWords(arrayOfStrings, word);

        for (int i=0; i< myWords.length; i++){
            System.out.println(myWords[i]);
        }






/*
        Q-2- * Find the name which has the max length.
 */
        String[] words = {"happy", "peace", "love", "dear"};
        String[] longestWord = findWordWithMaxLength(words);

        for (int i = 0; i < longestWord.length; i++) {
            System.out.println(longestWord[i]);
        }

    }






    /*
    Q-1
     */

    public static String[] countWords(String[] userArray, String word) {
        int count = 0;
        for (int i = 0; i < userArray.length; i++) {
            String[] arr = userArray[i].split(" ");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].indexOf(word) >= 0) {
                    count++;
                }
            }
        }
        String[] returnWord = new String[count];
        int z = 0;
        for (int i = 0; i < userArray.length; i++) {
            String[] arr = userArray[i].split(" ");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].indexOf(word) >= 0) {

                    returnWord[z] = arr[j];
                    z++;
                }
            }
        }
        return returnWord;


}





    /*
     * Q-2-
     */

    public static String[] findWordWithMaxLength (String[] userString) {
        int longestWord = 0;
        int count = 0;
        for (int i = 0; i < userString.length; i++) {
            if (userString[i].length() > longestWord) {
                longestWord = userString[i].length();
                count = 1;
            } else if (userString[i].length() == longestWord) {
                count++;
            }
        }
        String[] returnString = new String[count];
        int z = 0;
        for (int i = 0; i < userString.length; i++) {
            if (userString[i].length() == longestWord) {
                returnString[z] = userString[i];
                z++;
            }
        }

    return returnString;
    }


}
