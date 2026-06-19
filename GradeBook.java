class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public double[] getMarks() { return marks; }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) return 0.0;
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}

class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, int rollNumber, double[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() { return thesisTopic; }

    public void printThesisTitle() {
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args) {
        double[] marks = {85.5, 90.0, 78.0};
        Student undergrad = new Student("Siddhant", 101, marks);
        GraduateStudent grad = new GraduateStudent("Elena", 501, new double[]{92, 95, 88}, "Distributed Web Systems");

        System.out.println(undergrad.getName() + " Avg: " + undergrad.calculateAverage());
        System.out.println(grad.getName() + " Avg: " + grad.calculateAverage());
        grad.printThesisTitle();
    }
}