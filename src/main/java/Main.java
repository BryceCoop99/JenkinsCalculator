public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String testRun = args[0];
        int val1 = Integer.parseInt(args[1]);
        int val2=0;
        if (args.length > 2) {
            val2 = Integer.parseInt(args[2]);
        }

        switch (testRun) {
            case "add":
                calculator.add(val1, val2);
                break;
            case "subtract":
                calculator.subtract(val1, val2);
                break;
            case "multiply":
                calculator.multiply(val1, val2);
                break;
            case "divide":
                calculator.divide(val1, val2);
                break;
            case "fibonacci":
                calculator.fibonacciNumberFinder(val1);
                break;
            case "binary":
                calculator.intToBinaryNumber(val1);
                break;
        }


    }

}
