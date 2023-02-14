import java.util.Arrays;
import java.util.Scanner;

/*
Cyclically shifting elements
Write a program that reads an array of ints named a and cyclically shift the elements of the array to the right: a[0] goes to the place of a[1], a[1] goes to the place of a[2], ..., and the last element goes to the place of a[0]).

Input data format

The first line of the input contains the number of elements in the array. The second line contains the elements of the array.

Output data format

The single line should contain all shifted elements of the array. Elements must be separated by the space character.

Note that If your solution gets the code quality warning "System.arraycopy is more efficient", please simply ignore it in respect of this code challenge.


Sample Input:
5
1 2 3 4 5

Sample Output:
5 1 2 3 4
*/
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        int[] array2 = new int[arraySize];
        array2[0] = array[arraySize -1 ];
        for (int i = 1; i < array2.length; i++) {
            array2[i] = array[i - 1];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }



    }
}