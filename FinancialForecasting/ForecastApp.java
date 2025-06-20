
import java.util.*;

public class ForecastApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter current revenue (in USD): ");
        double currentRevenue = scanner.nextDouble();

        System.out.print("Enter expected annual growth rate (%): ");
        double growthRate = scanner.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = scanner.nextInt();

        System.out.println("\nFinancial Forecast for " + years + " years:");
        System.out.println("-----------------------------------------");

        // Forecast revenue for each year
        for (int i = 1; i <= years; i++) {
            currentRevenue += currentRevenue * (growthRate / 100);
            System.out.printf("Year %d: $%.2f\n", i, currentRevenue);
        }

        scanner.close();
    }
}
