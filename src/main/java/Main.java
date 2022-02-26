public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String testRun = args[0];
        int val1 = Integer.parseInt(args[1]);
        int val2=0;
        if (args.length > 2) {
            val2 = Integer.parseInt(args[2]);
        }

        int result = 0;
        switch (testRun) {
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
    }
}
