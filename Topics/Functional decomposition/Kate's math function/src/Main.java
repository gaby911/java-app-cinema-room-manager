import java.util.Scanner;

/*
Kate's math function
Here is a math function that Kate wants to use in her program:

f(x)=⎧⎩⎨⎪⎪x2+11/x2x2−1if   x≤0if   0<x<1if   x≥1

The template for this function is defined below. Let's decompose it!

Your task is to create three additional methods f1, f2, and f3 for each case and complete the method f. Each method should accept x as an argument with double type.


Sample Input:
0.5

Sample Output:
4.0
*/

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        if (x <= 0) return f1(x);
        else if (x >= 1) return f3(x);
        else return f2(x);
    }

    //implement your methods here
    public static double f1(double x) {
        return x * x + 1;
    }

    public static double f2(double x) {
        return 1 / (x * x);
    }

    public static double f3(double x) {
        return x * x - 1;
    }
}