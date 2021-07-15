package Class1;

import java.util.Locale;

public class Homework3
{
    public static void main(String[] args) {
        /*
        Question - 1 -
         */
        String sentence_1 = "hello dear, how are you?";
        int result_1 = 0;

        int lengthOfSentence_1 = sentence_1.length();
        System.out.println("Length of " + sentence_1 + " is " + lengthOfSentence_1 );

        String assignResult_1 = lengthOfSentence_1 > 10? "100" : "15";
        System.out.println("Result_1 =" + assignResult_1);

        /*
        Question- 2-
         */
        String sentence_2 = "We all ARe GOod ProgrAMmers";
        sentence_2.toLowerCase().replace("r", "F");
        System.out.println(sentence_2.toLowerCase().replace("r", "F"));

        /*
        Question- 3-
       */
        String sentence_3 = "ABC Networks";
        int sentence_3_Length = sentence_3.length();
        System.out.println("Length of " + sentence_3 + " is " + sentence_3_Length);

        boolean ignoreCaseSentence_3 = sentence_3.equalsIgnoreCase("ABC Networks");
        System.out.println("Does " + sentence_3 + " starts with 'a'(ignore cases) ? : " + ignoreCaseSentence_3);

        System.out.println("Does " + sentence_3 + " ends with 'K' (ignore cases) ? : " + ignoreCaseSentence_3);

        String result_3 = ignoreCaseSentence_3 ? "Media" : "Entertainment";
        System.out.println("Result_3 is " + result_3);









    }
}
