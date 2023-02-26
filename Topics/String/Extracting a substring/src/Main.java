import java.util.Scanner;
/*
Extracting a substring
Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.


Sample Input:
Java
0 2
Sample Output:
Jav
*/

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        String substring = text.substring(start,end+1);
        System.out.println(substring);
    }
}