package cinema;

import java.util.Scanner;

public class Cinema {

    static int rows;
    static int seatsPerRow;
    static int rowNumber;
    static int seatNumber;
    static int ticketPrice;

    public static void main(String[] args) {
//        enterNumberOfRowsAndSeatsAndCalculateProfit();
        printAllCinemaSeats();
        calculateTicketPrice();
        printAllCinemaSeatsWithSelectedSeat();
    }

    static void printAllCinemaSeats() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: " + "\n");
        rows = scanner.nextInt();

        System.out.print("Enter the number of seats in each row: " + "\n");
        seatsPerRow = scanner.nextInt();

        //Print Cinema with all the seats

        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= seatsPerRow; j++) {
            System.out.print(j + " ");
        }

        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seatsPerRow; j++) {
                System.out.print("S ");
            }
            System.out.println();
        }
        System.out.println();
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

    static void printAllCinemaSeatsWithSelectedSeat() {
        System.out.println("Cinema:");
        System.out.print("  ");
        for (int j = 1; j <= seatsPerRow; j++) {
            System.out.print(j + " ");
        }

        System.out.println();
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= seatsPerRow; j++) {
                if (i == rowNumber && j == seatNumber) System.out.print("B ");
                else System.out.print("S ");
            }
            System.out.println();
        }
    }

}