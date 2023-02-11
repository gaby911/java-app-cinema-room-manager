import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        *Interval
        Given an integer as an input, print True if its value falls within the interval (−15,12]∪(14,17)∪[19,+∞). Otherwise, print False (case sensitive).

        Notes:

        numbers denoted with a parenthesis () are exclusive;
        numbers denoted with a square bracket [] are inclusive.

        Sample Input:
        20

        Sample Output:
        True


        Sample Input:
        -20

        Sample Output:
        False*/
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (((n > -15) && (n <= 12)) || ((n > 14) && (n < 17)) || (n >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}