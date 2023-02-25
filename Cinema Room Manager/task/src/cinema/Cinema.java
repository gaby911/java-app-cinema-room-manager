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

    public static void main(String[] args) {

        initiateCinemaWithRowsAndSeats();
        while (flag) {
            showMenu();
            switch (menuSelector) {
                case 1: {
                    if (rowNumber > 0 && seatNumber > 0) {
                        selectSeat();
                        showTheSeats();
                    } else showTheSeats();
                    break;
                }
                case 2: {
                    calculateTicketPrice();
                    break;
                }
                case 0:
                    flag = false;
                    break;
            }
        }
    }

    static void initiateCinemaWithRowsAndSeats() {
        System.out.print("Enter the number of rows: " + "\n");
        rows = scanner.nextInt();

        System.out.print("Enter the number of seats in each row: " + "\n");
        seatsPerRow = scanner.nextInt();

        System.out.println();
        cinemaArray = new char[rows][seatsPerRow];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                cinemaArray[i][j] = 'S';  // Set all seats to "S" (available)
            }
        }
    }

    static void calculateTicketPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a row number: " + "\n");
        rowNumber = scanner.nextInt();

        System.out.print("Enter a seat number in that row: " + "\n");
        seatNumber = scanner.nextInt();

        if (rows * seatsPerRow <= 60) {
            ticketPrice = 10;
        } else {
            int frontRows = rows / 2;
            if (rowNumber <= frontRows) ticketPrice = 10;
            else ticketPrice = 8;

        }
        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println();
    }

    static void selectSeat() {
        for (int i = 0; i < cinemaArray.length; i++) {
            for (int j = 0; j < cinemaArray[i].length; j++) {
                if (i == rowNumber && j == seatNumber) {
                    cinemaArray[i - 1][j - 1] = 'B';
                }
            }
        }
    }

    static void showMenu() {
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
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
        System.out.println();
    }

}