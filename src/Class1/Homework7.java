package Class1;

public class Homework7 {
    public static void main(String[] args) {

        /*
        Task 1-  * Find out if the value stored in word variable is palindrome.
         */

        String word= "level";
        String task1Word = "";
        for (int i= word.length()-1; i>=0; i--) {
            task1Word += word.charAt(i);
            System.out.println(word);
        }
        boolean isPalindrome= true;
        for(int i= 0; i< word.length(); i++) {
            if (word.charAt(i) != task1Word.charAt(i)) {
                isPalindrome= false;
            }
            if (isPalindrome){
                System.out.println(word + " is a palindrome");
            }




        /*
        Task 2- Find if the value stored in num variable is a prime number or not.
          */

            int num= 7;
            boolean isPrime= true;

            for(int b= 2; b<num; b++){
                if(num%b==0) {
                    isPrime = false;
                    break; }
                }
            if(isPrime);
            System.out.println(num + " is a Prime number ");
                }



            /*
            Task 3- Write code to reverse a string
             */

            String task3String= "Happy Holidays";
            String reverse= "";
            int length= task3String.length();
            for (int c= length-1; c>=0; c-- ){
                reverse= reverse+task3String.charAt(c);
                System.out.println(task3String + " in reverse is "+ reverse);

            }



            /*
            Task 4- Count the number of the vowels (a,e,i,o,u) present in the given sentence.
             */

            String task4Sentence = "hOW arE You My DEAr FRiEnd";
            // 













    }
}
