import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*
        Exactly one parameter is positive
        Write a program that reads three integer numbers and prints true if exactly ONE number is positive (i.e. > 0).

        Otherwise, it should print false.


        Sample Input:
        1 1 1

        Sample Output:
        false


        Sample Input:
        1 0 -1

        Sample Output:
        true
         */
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if(firstNumber>0 && secondNumber<=0 && thirdNumber <=0) System.out.println(true);
        else if(secondNumber >0 && firstNumber <= 0 && thirdNumber <=0) System.out.println(true);
        else if(thirdNumber > 0 && firstNumber<=0 && secondNumber <= 0) System.out.println(true);
        else System.out.println(false);

    }
}