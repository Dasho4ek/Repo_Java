package Class1;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {

        /*
        Q-1
         */
        String sentence = "hAPpy nEw year TO you DeAr";
        String[] splitSentence = sentence.split(" ");
        String newSentence = "";
        for (int i = 0; i <= splitSentence.length; i++) {
            newSentence = newSentence + " " + splitSentence[i].substring(0, 1).toUpperCase() + splitSentence[i].substring(1).toLowerCase();
        }
        System.out.println(newSentence.trim());


        /*
        Q-2
         */
        String anySentence = "ThiS wOrlD Is sO bEauTiFUl";
        String[] anySentence_Split = anySentence.split(" ");
        anySentence = anySentence.toLowerCase();
        String abbreviation = "";
        for (int i = 0; i <= anySentence_Split.length; i++) {
            abbreviation = abbreviation + anySentence_Split[i].substring(0, 1).toUpperCase();
        }
        System.out.println("Abbreviation for " + anySentence + " is " + abbreviation.trim());


        /*
        Q-3
         */


        int studentScore = 175;
        int maxScore = 250;
        double percentage = studentScore * 100.0 / maxScore;
        char yourGrade = 'a';
        String scholarshipAmt = "";

        if (studentScore > 0 && studentScore <= maxScore) ;
        if (percentage >= 91) {
            yourGrade = 'A';
            scholarshipAmt = "full";
        } else if (percentage >= 81) {
            yourGrade = 'B';
            scholarshipAmt = "half";
        } else if (percentage >= 71) {
            yourGrade = 'C';
            scholarshipAmt = "half";
        } else if (percentage >= 61) {
            yourGrade = 'D';
            scholarshipAmt = "no";
        } else if (percentage >= 51) {
            yourGrade = 'E';
            scholarshipAmt = "no";
        } else {
            yourGrade = 'F';
            scholarshipAmt = "no";
        }
        System.out.println("Your percentage is: " + percentage + " and your Grade is: " + yourGrade);
        System.out.println("Based on your grade(" + yourGrade + "), you get " + scholarshipAmt + " scholarship for next year");



            /*
            Q-3-
            * Create an array and store 5 int-values.
            * Print the average of numbers in array.
             */
        int[] numbers = {10, 20, 30, 40, 50};
        double total= 0;
        for (double arrayNumbers : numbers){
            total+= arrayNumbers;
        }
        double average= 0;
        if (numbers.length>0){
            average = total / numbers.length;
        }

        System.out.println("The average of numbers"+ numbers+ " is " + average);



            /*
            Q-4-
            * if name found, Print "** is at position-5 in the array"
            * if name not found, print "** is not present in the array"
             */
        String[] names = {"John", "Lui", "Nancy", "Jack", "Frank"};
        String nameToSearch = "Nancy";
        boolean nameNotFound = false;

        for (int i = 0; i <= names.length; i++) {
            if (names[i] == nameToSearch) {
                nameNotFound = true;
                System.out.println(names[i] + " is at position 2 in the array");
            }
        }
        if (!nameNotFound) {
            System.out.println(nameToSearch + " is not present in the array");
        }




            /*
            Q-5
            * print the names from array if the name-length is >=5 and name contains 'o' or 'O'
             */

        String[] names_1 = {"john", "happy", "peACe", "jOy", "LEarN", "Orange", "king kong", "iRON MAN"};
        String namesFromArray = "";
        for (int i = 0; i <= names_1.length; i++)
            if (names_1[i].length() >= 5 && names_1[i].toLowerCase().contains("o")) {
                namesFromArray = namesFromArray + " " + names_1[i];
                System.out.println("Names from array are " + names_1[i]);
            }
        /* Im not sure how to make final answer to print on 1 line.//

         */




        /*
        Q-6-
        * Limitation: both array must be of same length
        *
        * if the numbers-array has 33 in it,
        *      print the index at which 33 is present in numbers array
        *      And, print the name present at same index in names array.
         */
        int[] numbers_2 = {11, 22, 33, 44, 55, 98, 65};
        String[] names_2 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};
        int indexToPrintNum = 33;
        for (int i = 0; i <= numbers_2.length; i++) {
            if (numbers_2[i] == indexToPrintNum)
            {
                System.out.println(indexToPrintNum + " is at index " + i);
                System.out.println("Name present at the same index is" + names_2[i]);
            } break;
            }


        }

    }