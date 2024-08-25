package Lesson_6;

public class Employee {

    //Создаём класс "Сотрудник" с полями.
    private String fullName;
    private String jobTitle;
    private String email;
    private String telephone;
    private double salary;
    private int age;
    //Создаём конструктор для заполнения полей.
    public Employee(String fullName, String jobTitle, String email, String telephone, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    //Метод, который выводит информацию об объекте в консоль.
    public void printInfo(){
        System.out.println("Full Name: " + fullName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Email: " + email);
        System.out.println("Telephone: " + telephone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
