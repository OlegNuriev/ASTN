package Less_7_Part_2;

public class Triangle implements Shape{
//Класс реализующий интерфейс
    private double side1;
    private double side2;
    private double side3;
    private String borderColor;
    private String fillColor;
//Конструктор класса
    public Triangle(double side1, double side2, double side3, String borderColor, String fillColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }
//Методы по расчету периметра/площади и заполнения цветом
    @Override
    public void setColor(String borderColor, String fillColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }
}
