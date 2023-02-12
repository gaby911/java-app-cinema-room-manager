import java.util.Scanner;

        /*
        Call me awesome
        Here's the method callMeAwesome. Write the invocation of this method in the template below.


        Sample Input:
        Alice

        Sample Output:
        Alice, you're awesome!
        */

public class Main {

    public static void main(String[] args) {
        callMeAwesome();
    }

    // Do not change code below
    public static void callMeAwesome() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + ", you're awesome!");
    }
}