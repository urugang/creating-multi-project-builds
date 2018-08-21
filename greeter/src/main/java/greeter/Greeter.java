package greeter;

public class Greeter {
    public static void main(String[] args) {
        final String output = GreetingFormatter.greeting(args[0]);
        System.out.printf("%s\n", output);

        // System.out.printf("from command stdin: %s\n", System.in.read());
    }
}
