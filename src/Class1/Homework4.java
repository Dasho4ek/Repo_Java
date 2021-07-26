package Class1;

import java.util.Arrays;
import java.util.Locale;

public class Homework4 {
    public static void main(String[] args) {
        /*
        Question 1-
         */
        //I used lowered all case and used Array/split words method to split the words.
        String threeWordSentence_1 = "hApPy nEW yeAr";
        String[] splitWords = threeWordSentence_1.split(" ");
        //Used substring method to separate first letter from each word,
        // uppercase method to make first letter capital
        //connected first letter with each word using substring method again.
        String word1 = splitWords[0].substring(0,1).toUpperCase() + splitWords[0].substring(1).toLowerCase();
        String word2 = splitWords[1].substring(0,1).toUpperCase()+ splitWords[1].substring(1).toLowerCase();
        String word3 = splitWords[2].substring(0,1).toUpperCase()+splitWords[2].substring(1).toLowerCase();
        System.out.println(word1 + " " +word2+ " " + word3);


        /*
        Question 2-
         */
        //Used same pattern as Q#1 to separate words and make each word's first letter capital.
        String threeWordSentence_2 = "wOrlD iS beaUTiFuL";
        String[] splitWords_2 = threeWordSentence_2.split(" ");
        String word_1 = splitWords_2[0].substring(0,1).toUpperCase()+splitWords_2[0].substring(1).toLowerCase();
        String word_2 = splitWords_2[1].substring(0,1).toUpperCase()+splitWords_2[1].substring(1).toLowerCase();
        String word_3 = splitWords_2[2].substring(0,1).toUpperCase()+splitWords_2[2].substring(1).toLowerCase();
        //used char method and uppercase method get first letter of each word and use as abbreviation.
        char word_1_1 = splitWords_2[0].toUpperCase().charAt(0);
        char word_2_2 = splitWords_2[1].toUpperCase().charAt(0);
        char word_3_3 = splitWords_2[2].toUpperCase().charAt(0);
        System.out.println("Abbreviation for " + word_1 +" "+ word_2 + " " + word_3 + " is " + word_1_1+ ""+ word_2_2+ "" + word_3_3);



        /* Question 3-
         */
        //used split Array method to spilt words and length method to et count of words in a sentence.
        String sentence_3 = "We are here to learn programming and testing";
        String[] numOfWords_Split = sentence_3.split(" ");
        int numOfWords= numOfWords_Split.length;
        System.out.println("Number of words in the sentence is " + numOfWords);






    }
}
