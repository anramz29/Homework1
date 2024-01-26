import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        // use the built scan functionality to receive user input
        Scanner scan = new Scanner(System.in);
        float input_money_floats = scan.nextFloat();
        // I encountered issues with dividing using floats,
        // changing to a whole number makes dividing easier
        int money = (int) (input_money_floats * 100);
        // calculate the number of quarters, in oder to calculate num
        int num_quarters = money / 25;
        // get the remainder
        money %= 25;
        // now divide the remainder by 10, for dimes
        int num_dimes = money/ 10;
        // get remainder, using compound assignment operator
        money %= 10;
        // same
        int num_nickels = money / 5;
        money %= 5;
        //representing all remaining cents as integers between [1:5]
        int num_pennies = money;

        // Output the number of each type of coin
        // unlike python here we need to concat print statements
        System.out.println("Number of Quarters: " + num_quarters);
        System.out.println("Number of Dimes: " + num_dimes);
        System.out.println("Number of Nickels: " + num_nickels);
        System.out.println("Number of Pennies: " + num_pennies);
    }
}
