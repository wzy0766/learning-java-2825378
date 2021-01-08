import javax.swing.ListSelectionModel;
import javax.swing.JSpinner.ListEditor;

public class Main {

    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        
        System.out.println("Your total meal price is: " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15, 0.2, 0.08);
        calculateTotalMealPrice(25, 0.18, 0.08);
    }

}
