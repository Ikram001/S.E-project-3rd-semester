import java.util.Scanner;

class calc {
    public static void main(String[] args) {

        char operator;
        Double num1, num2, result;

        // create an object of Scanner class
        Scanner user.input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = user.input.next().charAt(0);

        // ask users to enter nums
        System.out.println("Enter first num");
        num1 = user.input.nextDouble();

        System.out.println("Enter second num");
        num2 = user.input.nextDouble();

        switch (operator) {

            // performs addition between nums
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            // performs subtraction between nums
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            // performs multiplication between nums
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            // performs division between nums
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        user.input.close();
    }
}
