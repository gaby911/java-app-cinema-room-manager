import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        Decrement all
        Write a program that reads four numbers and decrements each of them.
        The program must output the results in the same order separated by spaces.

        Sample Input:
        10 11 -2 -3

        Sample Output:
        9 10 -3 -4
        */
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        System.out.println(--n1 + " " + --n2 + " " + --n3 + " " + --n4);
    }
}