package hw5;

public class Employee {
    private String surnameNameMiddleName;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String surnameNameMiddleName, String position, String email, String number, int salary, int age) {
        this.surnameNameMiddleName = surnameNameMiddleName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + surnameNameMiddleName + ";\nДолжность: " + position + ";\nEmail: " + email +
                ";\nНомер телефона: " + number + ";\nЗарплата: " + salary + ";\nВозраст: " + age + ".");
    }

    public int getAge() {
        return age;
    }
}
