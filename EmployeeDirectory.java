import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    // Метод для добавления нового сотрудника
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для поиска сотрудников по стажу
    public List<Employee> findEmployeesByExperience(int experience) {
        return employees.stream()
                .filter(e -> e.getExperience() == experience)
                .collect(Collectors.toList());
    }

    // Метод для получения номера телефона сотрудника по имени
    public List<String> getPhoneNumbersByName(String name) {
        return employees.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .map(Employee::getPhoneNumber)
                .collect(Collectors.toList());
    }

    // Метод для поиска сотрудника по табельному номеру
    public Employee findEmployeeById(int id) {
        return employees.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null); // Возвращает null, если сотрудник не найден
    }

    // Метод для получения списка всех сотрудников
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}