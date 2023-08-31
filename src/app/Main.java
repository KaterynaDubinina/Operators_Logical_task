package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static double taxRate;
    private final static String CURRENCY = "EUR";


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Please, enter your name: ");
        String name = scanner.nextLine();

        System.out.print( name + ", enter your monthly income, EUR: ");
        double monthlyIncome = scanner.nextDouble();

        if (monthlyIncome > 0 && monthlyIncome <= 10000){
            taxRate = monthlyIncome * 0.025; //calculates tax for 2.5% rate.
            System.out.format(Locale.US,"%n%s, your income is taxed at 2.5 percent." +
                            "%nYour monthly income tax is %s %.2f.", name, CURRENCY, taxRate);
        } else if (monthlyIncome >= 10001 && monthlyIncome <= 25001){
            taxRate = monthlyIncome * 0.043; //calculates tax for 4.3% rate.
            System.out.printf(Locale.US,"%n%s, your income is taxed at 4.3 percent." +
                            "%nYour monthly income tax is %s %.2f.", name, CURRENCY, taxRate);
        } else {
            taxRate = monthlyIncome * 0.067; //calculates tax for 6.7% rate.
            System.out.printf(Locale.US,"%n%s, your income is taxed at 6.7 percent." +
                            "%nYour monthly income tax is %s %.2f.", name, CURRENCY, taxRate);
        }

        scanner.close();
    }
}
