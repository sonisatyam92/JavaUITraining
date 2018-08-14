import java.util.Scanner;

public class SwitchSample {

    public static void main(String[] args) {
        int a=12,b=24;

        /*
         *
         * Marks : 10
         *
         * 0 -> poor
         * 1-3 -> Okay
         * 4- 6 -> Average
         * 7-9 -> Good
         * 10 -> Excellent
         *
         */


        int marks = 4;

        switch (marks) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
            case 7:
                System.out.println("7");
            case 8:
                System.out.println("8");
            case 9:
                System.out.println("9");

            default:
                System.out.println("Default");
        }

    }
}
