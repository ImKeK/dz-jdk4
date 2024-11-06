public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавление сотрудников
        directory.addEmployee(new Employee(1, "123-456-7890", "Alice", 5));
        directory.addEmployee(new Employee(2, "987-654-3210", "Bob", 3));
        directory.addEmployee(new Employee(3, "555-555-5555", "Alice", 7));

        // Поиск сотрудников по стажу
        System.out.println("Сотрудники со стажем 5 лет: " + directory.findEmployeesByExperience(5));

        // Получение номеров телефонов по имени
        System.out.println("Номера телефонов сотрудников по имени 'Alice': " + directory.getPhoneNumbersByName("Alice"));

        // Поиск сотрудника по табельному номеру
        Employee employee = directory.findEmployeeById(2);
        System.out.println("Сотрудник с табельным номером 2: " + employee);

        // Вывод всех сотрудников
        System.out.println("Все сотрудники: " + directory.getAllEmployees());
    }
}
