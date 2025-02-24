class Calc {
    // Private data fields
    private double num1;
    private double num2;

    // Default constructor
    public Calc() {
        // Initialize numbers to default values (optional)
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    // Setter for num1
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    // Setter for num2
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getter for num1
    public double getNum1() {
        return num1;
    }

    // Getter for num2
    public double getNum2() {
        return num2;
    }

    // Method to add num1 and num2
    public double add() {
        return num1 + num2;
    }

    // Method to subtract num2 from num1
    public double subtract() {
        return num1 - num2;
    }

    // Method to multiply num1 by num2
    public double multiply() {
        return num1 * num2;
    }

    // Method to divide num1 by num2
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero.");
            return 0.0;
        }
    }

    // Overridden toString method to display private data fields
    @Override
    public String toString() {
        return "Num1: " + num1 + "\n" + "Num2: " + num2;
    }
}