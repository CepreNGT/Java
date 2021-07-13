package hw5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Алексеев Алексей Алексеевич",
                "Стажёр",
                "AlexAA@mail.ru",
                "8-923-233-43-23",
                15000,
                17);
        employees[1] = new Employee("Иванов Иван Иванович",
                "Директор",
                "Ivanov1970@mail.ru",
                "8-700-700-55-55",
                150000,
                51);
        employees[2] = new Employee("Сергеев Сергей Сергеевич",
                "Бухгалтер",
                "Serj123@mail.ru",
                "8-873-646-34-56",
                80000,
                39);
        employees[3] = new Employee("Васильев Василий Васильевич",
                "Владелец",
                "VashVasiliy@mail.ru",
                "8-111-222-33-44",
                450000,
                45);
        employees[4] = new Employee("Андреев Андрей Андреевич",
                "Заместитель директора",
                "AAAndrey@mail.ru",
                "8-386-399-24-65",
                120000,
                48);
        for (Employee employee: employees) {
            if (employee.getAge() > 40) {
                employee.info();
                System.out.println();
            }
        }
    }
}
