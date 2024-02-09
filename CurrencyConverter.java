import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        String baseCurrency = "USD";
        String targetCurrency = "INR";
        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        if (exchangeRate != -1) {
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount to convert: ");
            double amount = scanner.nextDouble();

            
            double convertedAmount = amount * exchangeRate;

            
            System.out.printf("%.2f %s is equal to %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        } else {
            System.out.println("Failed to fetch exchange rates");
        }
    }

    private static double getExchangeRate(String baseCurrency, String targetCurrency) {
        
        if (baseCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return 83.02;
        }

        return -1;
    }
}
