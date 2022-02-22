package homework4;

/**
 * @author Artamonov Aleksandr
 */

public class Calculator {
    private double firstNum;
    private double secondNum;
    private String sign;

    public Calculator(double firstNum, String sign, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.sign = sign;
    }

    public double getResult() throws Exception {
        double result;
        switch (sign) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                if (secondNum == 0) throw new Exception("Деление на ноль запрещено");
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            default:
                throw new Exception("Не правильно введен арифметичиский знак");
        }
        return result;
    }
}
