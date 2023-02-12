import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        * Maximum element divisible by four
            Given a sequence of natural numbers, not exceeding 30000. Find the maximum element divisible by 4.
            There is always an element divisible by 4 in the sequence and the number of elements does not exceed 1000.

            As input, the program receives the number of elements in the sequence n (first line) and then the elements themselves (next n lines).
            The program should print a single number: the maximum element of the sequence divisible by 4.

            Try to solve this problem by using a for-loop.


            Sample Input:
            12
            32
            92
            98
            53
            12
            36
            41
            16
            81
            93
            40
            11

            Sample Output:
            92
            */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstNumber;
        int count = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            int n1 = scanner.nextInt();
            if (n1 % 4 == 0) {
                firstNumber = n1;
                count++;
            } else {
                continue;
            }

            for (int j = 1; j <= count; j++) {
                if (firstNumber > max) {
                    max = firstNumber;
                }
            }

        }
        System.out.println(max);

        //Method 2
        /*
        Scanner scanner = new Scanner(System.in);
        var max = 0;
        for (int i = 0, end = scanner.nextInt(); i < end; i++) {
            var element = scanner.nextInt();
            max = element % 4 == 0 && element > max ? element : max;
        }
        System.out.println(max);
        */

        //Method 3
        /*
         Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int current_max = 0;
        int num;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            if (num % 4 == 0 && num > current_max){
                current_max = num;
            }
        }
        System.out.println(current_max);
        */
    }
}