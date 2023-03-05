package cinema;

import java.util.Scanner;

public class Cinema {

    static int rows;
    static int seatsPerRow;
    static int rowNumber;
    static int seatNumber;
    static int ticketPrice;
    static int menuSelector;
    static boolean flag = true;
    static Scanner scanner = new Scanner(System.in);
    static char[][] cinemaArray;
    static int numberOfPurchasedTickets = 0;
    static int profit = 0;
    static int currentIncome = 0;

    public static void main(String[] args) {

        initiateCinemaWithRowsAndSeats();
        while (flag) {
            showMenu();
            switch (menuSelector) {
                case 1 -> {
                    showTheSeats();
                }
                case 2 -> {
                    boolean validInput = false;
                    do {
                        enterSelection();
                        if (rowNumber > rows || seatNumber > seatsPerRow) {
                            System.out.println();
                            System.out.println("Wrong input!");
                            System.out.println();
                        } else if (cinemaArray[rowNumber - 1][seatNumber - 1] == 'B') {
                            System.out.println();
                            System.out.println("That ticket has already been purchased!");
                            System.out.println();
                        } else {
                            validInput = true;
                            calculateTicketPrice();
                            selectSeat();
                        }
                    } while (!validInput);
                }
                case 3 -> {
                    showStatistics();
                }
                case 0 -> flag = false;
            }
        }
    }

    static void initiateCinemaWithRowsAndSeats() {
        System.out.print("Enter the number of rows: " + "\n");
        rows = scanner.nextInt();

        System.out.print("Enter the number of seats in each row: " + "\n");
        seatsPerRow = scanner.nextInt();

        cinemaArray = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                cinemaArray[i][j] = 'S';  // Set all seats to "S" (available)
            }
        }

        if (rows * seatsPerRow <= 60) {
            profit = rows * seatsPerRow * 10;
        } else {
            profit = (rows / 2) * seatsPerRow * 10 + (rows - (rows / 2)) * seatsPerRow * 8;
        }
    }

    static void calculateTicketPrice() {

        if (rows * seatsPerRow <= 60) {
            ticketPrice = 10;
        } else {
            int frontRows = rows / 2;
            if (rowNumber <= frontRows) ticketPrice = 10;
            else ticketPrice = 8;
        }
        System.out.println();
        System.out.println("Ticket price: $" + ticketPrice);
    }

    static void selectSeat() {
        cinemaArray[rowNumber - 1][seatNumber - 1] = 'B';
        currentIncome = currentIncome + ticketPrice;
        numberOfPurchasedTickets++;
    }

    static void showMenu() {
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        menuSelector = scanner.nextInt();
        System.out.println();
    }

    static void showTheSeats() {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= seatsPerRow; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < cinemaArray.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < cinemaArray[i].length; j++) {
                System.out.print(cinemaArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void showStatistics() {
        System.out.println("Number of purchased tickets: " + numberOfPurchasedTickets);
        String percentage = String.format("Percentage: %.2f", calculatePercentage());
        System.out.println(percentage + "%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + profit);
    }

    private static double calculatePercentage() {
        return (double) (100 * numberOfPurchasedTickets) / (rows * seatsPerRow);
    }

    private static void enterSelection() {
        System.out.print("Enter a row number: " + "\n");
        rowNumber = scanner.nextInt();

        System.out.print("Enter a seat number in that row: " + "\n");
        seatNumber = scanner.nextInt();
    }

}