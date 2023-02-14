import java.util.Scanner;

class Main {
    /*
    The minimum value of an array
Write a program that reads an array of integers and finds the minimum value of the array.

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format

An integer number representing the minimum in the input array.

Sample Input:
5
5 1 4 2 3

Sample Output:
1
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < arraySize; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}