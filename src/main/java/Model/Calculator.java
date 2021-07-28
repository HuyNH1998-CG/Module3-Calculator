package Model;

public class Calculator {
    public static float calculate(float num1, float num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else
                    throw new RuntimeException("Cant divide by zero");
            default:
                throw new RuntimeException("Invalid op");
        }
    }
}
