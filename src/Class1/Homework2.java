package Class1;

public class Homework2 {
    public static void main(String[] args) {
          double cTemp = 35;
          double fTemp = cTemp * 1.8 + 32;
        System.out.println(cTemp + "°C = " + fTemp + "°F" );

        double kTemp = cTemp + 273.15;
        System.out.println( cTemp + "°C = " + kTemp + "K");

        double fTem = 49;
        double cTem = (fTem - 32) * 5/9;
        System.out.println(fTem + "°F =" + cTem + " °C");

        double kTem = (fTem + 459.67) * 5/9;
        System.out.println(fTem + "°F = " + kTem + "K");

        double kTemper = 59;
        double cTemper = kTemper - 273.15;
        System.out.println(kTemper + "K = " + cTemper + "°C");

        double fTemper = kTemper * 9/5 - 459.67;
        System.out.println(kTemper + "K = " + fTemper + "°F");




    }
}
