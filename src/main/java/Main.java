import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the calculator\nEnter a command: ");
        String line = sc.nextLine();

        for (int i = 0; i < 1;) {
            Scanner values = new Scanner(line);
            String testRun = values.next();
            int val1 = Integer.parseInt(values.next());
            int val2 = 0;

            if (values.hasNext()) {
                val2 = Integer.parseInt(values.next());
            }


            int result = 0;
            switch (testRun) {
                case "exit":
                    i += 1;
                    break;
                case "add":
                    result = calculator.add(val1, val2);
                    break;
                case "subtract":
                    result = calculator.subtract(val1, val2);
                    break;
                case "multiply":
                    result = calculator.multiply(val1, val2);
                    break;
                case "divide":
                    result = calculator.divide(val1, val2);
                    break;
                case "fibonacci":
                    result = calculator.fibonacciNumberFinder(val1);
                    break;
                case "binary":
                    result = Integer.parseInt(calculator.intToBinaryNumber(val1));
                    break;
            }

            System.out.println(result);
            line = sc.nextLine();
        }
    }
}
