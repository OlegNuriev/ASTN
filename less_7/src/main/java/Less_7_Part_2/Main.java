package Less_7_Part_2;
//Программа для расчёта периметра и площади трёх фигур
//Так же задаёт каждой фигуре цвет заливки и границы
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10, "Red", "Black");

        Rectangle rectangle = new Rectangle(10, 20, "Blue", "Green");

        Triangle triangle = new Triangle(10.0, 10.0, 15.0, "Black", "White");

        System.out.println("Circle - Perimeter: " + circle.calculatePerimeter() + ", Area: " + circle.calculateArea() +
                ", Border Color: " + circle.getBorderColor() + ", Fill Color: " + circle.getFillColor());

        System.out.println("Rectangle - Perimeter: " + rectangle.calculatePerimeter() + ", Area: " + rectangle.calculateArea() +
                ", Border Color: " + rectangle.getBorderColor() + ", Fill Color: " + rectangle.getFillColor());

        System.out.println("Triangle - Perimeter: " + triangle.calculatePerimeter() + ", Area: " + triangle.calculateArea() +
                ", Border Color: " + triangle.getBorderColor() + ", Fill Color: " + triangle.getFillColor());
    }
}

