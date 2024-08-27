package less_8;

import static less_8.ArraySumCalculator.sum2DArray;

public class Main {
    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "QWERTY", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "12", "10"}
        };

        try {
            int sum = sum2DArray(array);
            System.out.println("Сумма всех элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}