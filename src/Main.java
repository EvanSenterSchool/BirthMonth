import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int birthNumber;
        int monthJanuary = 1;
        int monthFebruary = 2;
        int monthMarch = 3;
        int monthApril = 4;
        int monthMay = 5;
        int monthJune = 6;
        int monthJuly = 7;
        int monthAugust = 8;
        int monthSeptember = 9;
        int monthOctober = 10;
        int monthNovember = 11;
        int monthDecember = 12;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of your birth month");
        if (scan.hasNextInt()) {
            birthNumber = scan.nextInt();


            if (birthNumber >= 13) {
                System.out.println("you entered an incorrect month value.");
            }
            if (birthNumber <= 0){
                System.out.println("you entered an incorrect month value.");
            }
            if (birthNumber == monthJanuary) {
                System.out.println("your month is January");
            }
            else if (birthNumber == monthFebruary) {
                System.out.println("your month is February");
            }

            else if (birthNumber == monthMarch) {
                System.out.println("your month is March");
            }
            else if (birthNumber == monthApril) {
                System.out.println("your month is April");
            }
            else if (birthNumber == monthMay) {
                System.out.println("your month is May");
            }
            else if (birthNumber == monthJune) {
                System.out.println("your month is June");
            }
            else if (birthNumber == monthJuly) {
                System.out.println("your month is July");
            }
            else if (birthNumber == monthAugust) {
                System.out.println("your month is August");
            }
            else if (birthNumber == monthSeptember) {
                System.out.println("your month is September");
            }
            else if (birthNumber == monthOctober) {
                System.out.println("your month is October");
            }
            else if (birthNumber == monthNovember) {
                System.out.println("your month is November");
            }
            else if (birthNumber == monthDecember) {
                System.out.println("your month is December");
            }
        }


    }
}