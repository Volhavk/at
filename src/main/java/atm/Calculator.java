package atm;

import java.util.Scanner;

public class Calculator {
    private static double num1;
    private static double num2;
    private static double result;
    private static char operation;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enterNumbers();
        result = calc(num1,num2);
        System.out.println("Result: "+result);
    }

    private static void enterNumbers() {
        System.out.println("Enter first: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter second: ");
        num2 = scanner.nextDouble();
    }

    private static char getOperation(){
        System.out.println("Enter operation:");
        operation = scanner.next().charAt(0);
        return operation;
    }

    private static double calc(double num1, double num2){
        operation = getOperation();
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if (num2 == 0){
                    throw new ArithmeticException("Zero divide");
                }
                result = num1/num2;
                break;
            default:
                System.out.println("Unknown operation");
        }
        return result;
    }

}
