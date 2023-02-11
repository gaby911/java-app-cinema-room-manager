import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*Check the value
        Write a program that reads an integer value and checks if it is less than 10 and greater than 0.

        Your program should print a boolean value (true or false).


        Sample Input:
        0

        Sample Output:
        false
        */
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if (number > 0 && number < 10) System.out.println(true);
        else System.out.println(false);
    }
}