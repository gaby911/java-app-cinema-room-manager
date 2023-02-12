import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        * The length of the sequence
            For its input, the program gets a sequence of non-negative integers; each integer is written on a separate line.
            The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).

            Don’t read numbers following the number 0.

            Sample Input:
            1
            7
            9
            0
            5

            Sample Output:
            3
             */
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num != 0) counter++;
            else break;
        }
        System.out.println(counter);
    }
}