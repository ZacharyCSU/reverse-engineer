import java.util.Scanner;

class Runner {
    public static void main(String[] args) {
        // Instantiate a Calc object
        Calc myCalculator = new Calc();
        Scanner scan = new Scanner(System.in);
        double n1 = 0, n2 = 0;
        
        // Get user input for two numbers safely
        n1 = getValidNumber(scan, "Please enter the first number: ");
        n2 = getValidNumber(scan, "Please enter the second number: ");
        
        // Pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);
        
        // Output from Calc instance
        System.out.println(myCalculator);
        
        // Examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());
        
        // Calling Calc methods directly
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());
    }
    
    // Method to ensure valid numeric input
    private static double getValidNumber(Scanner scan, String prompt) {
        double num;
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                scan.nextLine(); // Consume newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scan.next(); // Consume invalid input
            }
        }
        return num;
    }
}
