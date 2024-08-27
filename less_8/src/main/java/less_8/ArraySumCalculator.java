package less_8;

public class ArraySumCalculator {
   // Метод `sum2DArray` вычисляет сумму элементов массива. Он проверяет правильность размера массива и
   // преобразует строки в целые числа для вычисления суммы.
   // Если размер массива неверный или встречаются неверные данные, метод генерирует соответствующее исключение.
    public static int sum2DArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        return sum;
    }
}





