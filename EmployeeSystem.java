class Employee {
    private String name;
    private String id;
    private double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    public double getBaseSalary() { return baseSalary; }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double hourlyRate;

    public Developer(String name, String id, double baseSalary, int overtimeHours, double hourlyRate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * hourlyRate);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee m = new Manager("Alice", "MGR01", 80000, 15000);
        Employee d = new Developer("Bob", "DEV04", 60000, 20, 50);

        System.out.println(m.getName() + " Salary: $" + m.calculateSalary());
        System.out.println(d.getName() + " Salary: $" + d.calculateSalary());
    }
}
