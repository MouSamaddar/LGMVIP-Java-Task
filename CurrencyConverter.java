import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conversion rates (as of writing this example)
        double usdToRupees = 83.68;
        double usdToYen = 154.62;
        double usdToEuro = 0.94;
        double usdToPound = 0.80;

        // Display currency code options
        System.out.println("Enter the currency code:");
        System.out.println("1. Dollar");
        System.out.println("2. Rupees");
        System.out.println("3. Pound");
        System.out.println("4. Euro");
        System.out.println("5. Yen");

        int currencyCode = scanner.nextInt();

        // Handle currency conversion based on user input
        switch (currencyCode) {
            case 1: // Convert from Dollar to other currencies
                System.out.print("Enter amount in Dollar: ");
                double dollarAmount = scanner.nextDouble();
                double rupeesAmount = dollarAmount * usdToRupees;
                double yenAmount = dollarAmount * usdToYen;
                double euroAmount = dollarAmount * usdToEuro;
                double poundAmount = dollarAmount * usdToPound;

                System.out.println("Converted amount in Rupees: " + rupeesAmount);
                System.out.println("Converted amount in Yen: " + yenAmount);
                System.out.println("Converted amount in Euro: " + euroAmount);
                System.out.println("Converted amount in Pound: " + poundAmount);
                break;
            case 2: // Convert from Rupees to other currencies
                System.out.print("Enter amount in Rupees: ");
                double rupeesInput = scanner.nextDouble();
                double dollarsFromRupees = rupeesInput / usdToRupees;
                double yenFromRupees = dollarsFromRupees * usdToYen;
                double euroFromRupees = dollarsFromRupees * usdToEuro;
                double poundFromRupees = dollarsFromRupees * usdToPound;

                System.out.println("Converted amount in Dollar: " + dollarsFromRupees);
                System.out.println("Equivalent amount in Yen: " + yenFromRupees);
                System.out.println("Equivalent amount in Euro: " + euroFromRupees);
                System.out.println("Equivalent amount in Pound: " + poundFromRupees);
                break;
            case 3: // Convert from Pound to other currencies
                System.out.print("Enter amount in Pound: ");
                double poundInput = scanner.nextDouble();
                double dollarsFromPound = poundInput / usdToPound;
                double yenFromPound = dollarsFromPound * usdToYen;
                double euroFromPound = dollarsFromPound * usdToEuro;
                double rupeesFromPound = dollarsFromPound * usdToRupees;

                System.out.println("Equivalent amount in Dollar: " + dollarsFromPound);
                System.out.println("Equivalent amount in Yen: " + yenFromPound);
                System.out.println("Equivalent amount in Euro: " + euroFromPound);
                System.out.println("Equivalent amount in Rupees: " + rupeesFromPound);
                break;
            case 4: // Convert from Euro to other currencies
                System.out.print("Enter amount in Euro: ");
                double euroInput = scanner.nextDouble();
                double dollarsFromEuro = euroInput / usdToEuro;
                double yenFromEuro = dollarsFromEuro * usdToYen;
                double poundFromEuro = dollarsFromEuro * usdToPound;
                double rupeesFromEuro = dollarsFromEuro * usdToRupees;

                System.out.println("Equivalent amount in Dollar: " + dollarsFromEuro);
                System.out.println("Equivalent amount in Yen: " + yenFromEuro);
                System.out.println("Equivalent amount in Pound: " + poundFromEuro);
                System.out.println("Equivalent amount in Rupees: " + rupeesFromEuro);
                break;
            case 5: // Convert from Yen to other currencies
                System.out.print("Enter amount in Yen: ");
                double yenInput = scanner.nextDouble();
                double dollarsFromYen = yenInput / usdToYen;
                double euroFromYen = dollarsFromYen * usdToEuro;
                double poundFromYen = dollarsFromYen * usdToPound;
                double rupeesFromYen = dollarsFromYen * usdToRupees;

                System.out.println("Equivalent amount in Dollar: " + dollarsFromYen);
                System.out.println("Equivalent amount in Euro: " + euroFromYen);
                System.out.println("Equivalent amount in Pound: " + poundFromYen);
                System.out.println("Equivalent amount in Rupees: " + rupeesFromYen);
                break;
            default:
                System.out.println("Invalid currency code.");
                break;
        }

        scanner.close();
    }
}
