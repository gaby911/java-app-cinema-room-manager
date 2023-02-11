import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; number != 0; i++) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}