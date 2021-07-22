package Class1;

public class Homework5 {
    public static void main(String[] args) {

        // Question#1

        int studentScore = 175;
        int maxScore = 250;
        double thePercentage = 70;
        if (thePercentage >= 91 || thePercentage <= 100) {
            System.out.println("Your percentage: 91-100 and your Grade is: A");
        } else if (thePercentage >= 81 || thePercentage >= 90.99) {
            System.out.println("Your percentage: 81-90.99 and your Grade is: B");
        } else if (thePercentage >= 71 || thePercentage <= 80.99){
            System.out.println("Your percentage: 71-80.99 and your Grade is: C");
        } else if (thePercentage >= 61 || thePercentage <= 70.99){
            System.out.println("Your percentage: 61-70.99 and your Grade is: D");
        } else if (thePercentage >= 51 || thePercentage <= 60.99) {
            System.out.println("Your percentage: 51-60.99 and your Grade is: E");
        } else if (thePercentage <= 50.99) {
            System.out.println("Your percentage: 50.99 or less and your Grade is: E");
        }


        //Question#2

        int num = 16;

        if (num%3 == 0) {
            System.out.println("divisible by 3");
        } else if (num%5 ==0) {
            System.out.println("divisible by 5");
        } else if (num%3 ==0 && num%5 ==0) {
            System.out.println("divisible by both");
        }else {
            System.out.println( num );
        }

    }
}


