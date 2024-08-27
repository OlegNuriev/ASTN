package less_8;
//Класс является пользовательским исключением
public class MyArraySizeException extends Throwable {
    public MyArraySizeException(String message) {
        super(message);
    }
}
