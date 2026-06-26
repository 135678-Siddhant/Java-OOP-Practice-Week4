class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }

    public void getRoleDetails() {
        System.out.println("University Member profile: " + name);
    }
}

class StudentPerson extends Person { 
    private String program;

    public StudentPerson(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("[Student Profile] ID: " + getId() + " | Name: " + getName() + " | Program: " + program);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("[Faculty Profile] ID: " + getId() + " | Name: " + getName() + " | Specialization: " + subject);
    }
}

class Admin extends Person {
    private String department;

    public Admin(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void getRoleDetails() {
        System.out.println("[Admin Profile] ID: " + getId() + " | Name: " + getName() + " | Department Operations: " + department);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Person[] campusRegistry = {
            new StudentPerson("Siddhant Subedi", "CSIT-2025", "BSc. CSIT"),
            new Teacher("Dr. Sharma", "FAC-303", "Object Oriented Paradigms"),
            new Admin("Martha", "ADM-002", "Admissions & Finance")
        };

        for (Person individual : campusRegistry) {
            individual.getRoleDetails();
        }
    }
}
