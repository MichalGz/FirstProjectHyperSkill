package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalIncome = 0;

        // Product prices
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Bubblegum", 2.0);
        productPrices.put("Toffee", 0.2);
        productPrices.put("Ice cream", 5.0);
        productPrices.put("Milk chocolate", 4.0);
        productPrices.put("Doughnut", 2.50);
        productPrices.put("Pancake", 3.2);

        // Income for each product
        Map<String, Double> income = new HashMap<>();
        income.put("Bubblegum", 202.0);
        income.put("Toffee", 118.0);
        income.put("Ice cream", 2250.0);
        income.put("Milk chocolate", 1680.0);
        income.put("Doughnut", 1075.0);
        income.put("Pancake", 80.0);

        // Print earned amount for each item
        System.out.println("Earned amount:");
        for (Map.Entry<String, Double> entry : income.entrySet()) {
            String productName = entry.getKey();
            double amount = entry.getValue();
            totalIncome += amount;
            System.out.println(productName + ": $" + amount);
        }

        System.out.println("Income: $" + totalIncome);
        System.out.println("Staff expenses: ");
        int staffExpenses = scanner.nextInt();

        // Prompt user for other expenses
        System.out.println("Other expenses: ");
        int otherExpenses = scanner.nextInt();


        // Calculate and print net income
        double netIncome = totalIncome - (staffExpenses + otherExpenses);
        System.out.println("Net Income: $" + netIncome);
    }
}
