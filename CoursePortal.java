class Course {
    private String title;
    private String duration;
    private String instructor;

    public Course(String title, String duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getTitle() { return title; }
    public String getDuration() { return duration; }
    public String getInstructor() { return instructor; }

    public void getCourseInfo() {
        System.out.print("Course: " + title + " | Length: " + duration + " | Host: " + instructor);
    }
}

class LiveCourse extends Course {
    private String scheduleTime;

    public LiveCourse(String title, String duration, String instructor, String scheduleTime) {
        super(title, duration, instructor);
        this.scheduleTime = scheduleTime;
    }

    @Override
    public void getCourseInfo() {
        super.getCourseInfo();
        System.out.println(" [LIVE STREAM] Scheduled broadcast: " + scheduleTime);
    }
}

class RecordedCourse extends Course {
    private int videoCount;

    public RecordedCourse(String title, String duration, String instructor, int videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    @Override
    public void getCourseInfo() {
        super.getCourseInfo();
        System.out.println(" [ON-DEMAND] Catalog volume: " + videoCount + " modules ready.");
    }
}

public class CoursePortal {
    public static void main(String[] args) {
        Course c1 = new LiveCourse("Advanced Systems Architecture", "6 Weeks", "Dr. Miller", "Mon/Wed 7 PM");
        Course c2 = new RecordedCourse("Introduction to Game Design Pipelines", "12 Hours", "Prof. Croft", 45);

        c1.getCourseInfo();
        c2.getCourseInfo();
    }
}
