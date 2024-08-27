package Less_7_Part_2;

public interface Shape {

    void setColor(String borderColor, String fillColor); //интерфейс с методами расчетов и наполнения цветом

    default double calculatePerimeter() {
        return 0;
    }

    default double calculateArea() {
        return 0;
    }

    String getBorderColor();
    String getFillColor();
}

