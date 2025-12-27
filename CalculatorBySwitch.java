import java.util.Scanner;

public class CalculatorBySwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;
        System.out.println("Enter the First Number :");
        num1 = sc.nextDouble();
        System.out.println("Enter an operator (+,-,*,/,^): ");
        operator = sc.next().charAt(0);
        System.out.println("Enter the Second Number :");
        num2 = sc.nextDouble();
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Number can't be divided by zero");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Input!");
                validOperation = false;
            }
        }
        if (validOperation) {
            System.out.println(result);
        }
        sc.close();
    }
}