package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static double taxRate1; //from 0 to 10000, at a rate of 2.5%.
    static double taxRate2; //from 10 001 to 25001, at a rate of 4.3%.
    static double taxRate3; //more than 25001, at a rate of 6.7%.
    private final static String CURRENCY = "EUR";


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Please, enter your name: ");
        String name = scanner.nextLine();

        System.out.print( name + ", enter your monthly income, EUR: ");
        double monthlyIncome = scanner.nextDouble();

        taxRate1 = monthlyIncome * 0.025; //calculates tax for 2.5% rate.
        taxRate2 = monthlyIncome * 0.043; //calculates tax for 4.3% rate.
        taxRate3 = monthlyIncome * 0.067; //calculates tax for 6.7% rate.

        if (monthlyIncome > 0 && monthlyIncome <= 10000){
            System.out.format(Locale.US,"%n%s, your income is taxed at 2.5 percent." +
                            "%nYour monthly income tax is %s %.2f.", name, CURRENCY, taxRate1);
        } else if (monthlyIncome >= 10001 && monthlyIncome <= 25001){
            System.out.printf(Locale.US,"%n%s, your income is taxed at 4.3 percent." +
                            "%nYour monthly income tax is %s %.2f.", name, CURRENCY, taxRate2);
        } else if (monthlyIncome > 25001){
            System.out.printf(Locale.US,"%n%s, your income is taxed at 6.7 percent." +
                            "%nYour monthly income tax is %s %.2f.", name, CURRENCY, taxRate3);
        } else System.out.println("Sorry, but I can't calculate the tax on negative income.");

        scanner.close();
    }
}
