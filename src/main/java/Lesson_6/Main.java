package Lesson_6;

public class Main {
    public static void main(String[] args) {

        //Создаём массив из 5ти сотрудников.
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Alen Delon", "Developer",
                "ad@mail.com", "+7234567890", 60000.0, 40);
        employees[1] = new Employee("Jone Smith", "Designer",
                "js@mail.com", "+7987654321", 55000.0, 30);
        employees[2] = new Employee("Alice Selezneva", "Manager",
                "as@amil.com", "+7765432987", 70000.0, 40);
        employees[3] = new Employee("Vladimir Vladimirovich", "Engineer",
                "vv@mail.com", "+7876543210", 65000.0, 32);
        employees[4] = new Employee("Aleksandr Grigorievich", "Analyst",
                "ag@mail.com", "+7654321987", 58000.0, 28);

        //Вывести информацию обо всех сотрудниках
        //for (Employee employee : employees)
        //   employee.printInfo();

        employees[4].printInfo();//Вывести информацию об одном сотруднике

        Park myPark = new Park("Wonderland");

        Park.Attraction attraction1 = myPark.new Attraction("Ferris Wheel", "9:00 - 18:00",
                25.0);
        Park.Attraction attraction2 = myPark.new Attraction("Autodrom", "10:00 - 19:00",
                15.0);

        attraction1.displayInfo();
        attraction2.displayInfo();

    }
}