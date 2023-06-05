package calculate;

public class Calculator {
    int sum, sub, mul;
    double div;

    public void addition(int a, int b) {
        System.out.println("Addition of "+ a + " and " + b + " is: " +sum );
    }

    public void subtraction(int a, int b) {
        System.out.println("Subtraction of "+ a + " and " + b + " is: " +sub );
    }

    public void multiplication(int a, int b) {
        System.out.println("Multiplication of "+ a + " and " + b + " is: " +mul );
    }

    public void division(int a, int b) {
        System.out.println("Division of "+ a + " and " + b + " is: " +div );
    }

    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            sum = a + b;
            addition(a,b);
        } else if (symbol == '-') {
            sub = a - b;
            subtraction(a,b);
        } else if (symbol == '*') {
            mul = a * b;
            multiplication(a,b);
        } else if (symbol == '/') {
            div = a / b;
            division(a,b);
        }
    }
}


