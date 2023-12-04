import java.util.Scanner;

public class DailyDrivingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter information
        System.out.print("Enter total miles driven per day: ");
        double totalMilesDriven = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: $");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double averageMilesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: $");
        double parkingFeePerDay = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = input.nextDouble();

        // Calculate the cost per day
        double gallonPerDay = totalMilesDriven / averageMilesPerGallon;
        double costPerDay = (gallonPerDay * costPerGallon) + parkingFeePerDay + tollsPerDay;

        // Display the result
        System.out.printf("\nYour daily driving cost is: $%.2f%n", costPerDay);




    }
}
