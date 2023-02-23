import java.util.Scanner;

/*
Direction
Write a program, which reads the number of direction (1 – up, 2 – down, 3 – left, 4 – right, 0 – do not move) and outputs the text "move up" (or "move down", or "move left", or "move right", or "do not move" depending on the entered number). If it is a number that does not belong to any of the listed directions, the program should output "error!"

Note: the output text should exactly match the sample, including the letters’ case and location of spaces.


Sample Input:
1

Sample Output:
move up
*/
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "move";
        switch (n) {
            case 1:
                System.out.println(s + " up");
                break;
            case 2:
                System.out.println(s + " down");
                break;
            case 3:
                System.out.println(s + " left");
                break;
            case 4:
                System.out.println(s + " right");
                break;
            case 0:
                System.out.println("do not " + s);
                break;
            default:
                System.out.println("error!");
                break;
        }
    }
}