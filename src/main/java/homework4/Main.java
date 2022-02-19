package homework4;

import java.util.Scanner;

/**
 * @author Artamonov Aleksandr
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNum = console.nextDouble();
        System.out.print("Введите знак: ");
        String sign = console.next();
        System.out.print("Введите второе число: ");
        double secondNum = console.nextDouble();

        Functional.selectOperation(firstNum,sign,secondNum);
        console.close();
    }
}
