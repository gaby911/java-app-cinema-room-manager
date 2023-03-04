class FixingExceptions {

    /*
     Calculate Square
You need to implement the calculateSquare method.
It should output the square of the element by the provided index of an array.
In the case when the exception might happen, your program output should be: Exception!
*/

    public static void calculateSquare(int[] array, int index) {
        try {
            System.out.println(array[index] * array[index]);

        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }
}