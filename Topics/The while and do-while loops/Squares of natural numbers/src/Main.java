import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        Squares of natural numbers
            Read an integer number N from the input and print all the squares of positive integers:

            less than or equal to N,
            in ascending order.

            Sample Input:
            50

            Sample Output:
            1
            4
            9
            16
            25
            36
            49


            Sample Input:
            1

            Sample Output:
            1
            */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int i = 1;
        while (i * i <= N) {
            System.out.println(i * i);
            i++;

        }
    }
}