class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void getTreatmentPlan() {
        System.out.println("Standard general health routing evaluation.");
    }
}

class InPatient extends Patient {
    private String roomNumber;

    public InPatient(String name, int age, String roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() { return roomNumber; }

    @Override
    public void getTreatmentPlan() {
        System.out.println("In-Patient [" + getName() + "] assigned to room " + roomNumber + ": Full-scale regular monitoring, IV fluids, and medication schedules.");
    }
}

class OutPatient extends Patient {
    private String appointmentDate;

    public OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDate() { return appointmentDate; }

    @Override
    public void getTreatmentPlan() {
        System.out.println("Out-Patient [" + getName() + "] scheduling window on " + appointmentDate + ": Walk-in evaluation checkup, prescription refills.");
    }
}

public class HospitalRecords {
    public static void main(String[] args) {
        Patient p1 = new InPatient("David", 45, "ICU-402");
        Patient p2 = new OutPatient("Sarah", 29, "2026-06-25");

        p1.getTreatmentPlan();
        p2.getTreatmentPlan();
    }
}