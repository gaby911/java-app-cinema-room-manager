class Application {
    /*
    Application as a class
You are given a class named Application.

Implement an instance method run(String[] args) that takes an array of strings and returns nothing. The method should output all the strings in the array, each on a new line.

Let's consider the example. Suppose the run method is invoked with the following argument: ["arg1", "arg2", "arg3"]

In this case, the method's output will be:

arg1
arg2
arg3
*/

    void run(String[] args) {
        for (String str:args) {
            System.out.println(str);
        }
    }
}