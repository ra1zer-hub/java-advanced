package homework3.part1;

import java.util.Arrays;

/**
 * @author Artamonov Aleksandr
 */

public class Array {
    public static void main(String[] args) {
        int[] arrayNumbers = new int[20];
        System.out.print("Массив заполнен числами: ");
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(arrayNumbers[i] + ", ");
        }
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] < 0 && arrayNumbers[i] > maxNegative) {
                maxNegative = arrayNumbers[i];
                negative = i;
            }
            if (arrayNumbers[i] > 0 && arrayNumbers[i] < minPositive) {
                minPositive = arrayNumbers[i];
                positive = i;
            }
        }
        System.out.println("\nМаксимальный отрицательный элемент: " + maxNegative);
        System.out.println("Минимальный положительный элемент: " + minPositive);
        int temp = arrayNumbers[negative];
        arrayNumbers[negative] = arrayNumbers[positive];
        arrayNumbers[positive] = temp;
        System.out.println("Измененный массив: " + Arrays.toString(arrayNumbers));
    }
}
