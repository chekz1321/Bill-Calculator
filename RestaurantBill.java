import javax.swing.*;
import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args){

        final double taxAmount = 0.0625;
                final double tipAmount = 0.15;
                        String strMealcharge;
                        double mealCharge = 100;
                        double tax;
                        double tip;
                        double total;

                        strMealcharge = JOptionPane.showInputDialog("Input Meal Charge:"+ mealCharge);
                        mealCharge = Double.parseDouble(strMealcharge);
                    //had to parse mealCharge, from string to integer

                        JOptionPane.showMessageDialog(null,
                                "Meal Charge:" +mealCharge);

                        tip = tipAmount * mealCharge;
                        tax = taxAmount * mealCharge;
                                //program works fine with indentation
                //mealcharge is name of meal,C is capitalized because it is not a keyword.
        // taxamount is the tax in %  amount,tipAmount is tip % .
        //I started calculating mealcharge with 100 to make it easier for myself to calculate
        //change final amount later
        total = mealCharge + tip + tax;
        // putting total above tip and tax doesnt run the program as it gives an initialization error

        JOptionPane.showMessageDialog(null,
        "Tax:" + tax);
        JOptionPane.showMessageDialog(null,
        "Tip:" + tip);
        JOptionPane.showMessageDialog(null,
        "Total:" + total);
        Scanner db = new Scanner(System.in);
        //db means displaybox its the name of the class I chose
        mealCharge = db.nextInt();
        System.exit(0);
    }
}