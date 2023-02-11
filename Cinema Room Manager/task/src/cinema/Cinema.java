package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        enterNumberOfRowsAndSeatsAndCalculateProfit();

    }

    static void enterNumberOfRowsAndSeatsAndCalculateProfit() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of seats in each row: ");
        int seatsPerRow = input.nextInt();

        int totalSeats = rows * seatsPerRow;
        int profit = 0;
        if (totalSeats <= 60) {
            profit = totalSeats * 10;
        } else {
            int frontRows = rows / 2;
            int backRows = rows - frontRows;
            profit = frontRows * seatsPerRow * 10 + backRows * seatsPerRow * 8;
        }

        System.out.println("Total income: $" + profit);

    }

}