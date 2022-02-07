package homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int number = console.nextInt();
        if (number == 1) {
            calculator();
        } else if (number == 2) {
            maxWordSearch();
        }
        console.close();
    }

    public static void maxWordSearch() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        String[] arrayOfWords = new String[console.nextInt()];
        for (int i = 0; i < arrayOfWords.length; i++) {
            System.out.println("Введите слово");
            arrayOfWords[i] = console.next();
        }
        console.close();
        int maxWordSize = 0;
        String maxWord = "";
        for (String word : arrayOfWords) {
            if (word.length() > maxWordSize) {
                maxWordSize = word.length();
                maxWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + maxWord);
    }

    public static void calculator() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double firstNum = console.nextDouble();
        System.out.print("Введите знак: ");
        String sign = console.next();
        System.out.print("Введите второе число: ");
        double secondNum = console.nextDouble();
        double result = 0;
        console.close();

        switch (sign) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            default:
                System.err.println("Не правильно введен арифметичиский знак");
                System.exit(0);
        }
        System.out.printf("%.4f", result);
    }
}
