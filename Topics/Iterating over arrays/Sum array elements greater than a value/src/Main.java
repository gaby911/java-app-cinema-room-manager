import java.util.Arrays;
import java.util.Scanner;

class Main {
    /*
    Sum array elements greater than a value
    Write a program that reads an array of ints and an integer number n. The program must sum all the array elements greater than n.

    Input data format

    The first line contains the size of an array.
    The second line contains the elements of the array separated by spaces.
    The third line contains the number n.

    Output data format

    Only a single number representing the sum.


    Sample Input:
    5
    5 8 11 2 10
    8

    Sample Output:
    21


    Sample Input:
    4
    -5 -4 -6 -11
    -10

    Sample Output:
    -15
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            if(array[i] > n){
                sum += array[i];
            }
        }
        System.out.println(sum);

    }
}