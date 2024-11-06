public class Employee {
    private int id; // Табельный номер
    private String phoneNumber; // Номер телефона
    private String name; // Имя
    private int experience; // Стаж

    // Конструктор
    public Employee(int id, String phoneNumber, String name, int experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    // Переопределение метода toString для удобного вывода информации о сотруднике
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber +
        ", name='" + name +
        ", experience=" + experience +
                '}';
    }
}