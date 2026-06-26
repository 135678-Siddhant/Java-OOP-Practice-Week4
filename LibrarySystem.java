class LibraryItem {
    private String title;
    private String author;
    private String id;

    public LibraryItem(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getId() { return id; }

    public void getInfo() {
        System.out.print("[" + id + "] " + title + " by " + author);
    }
}

class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, String id, int pageCount) {
        super(title, author, id);
        this.pageCount = pageCount;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" Type: Book (" + pageCount + " pages)");
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String author, String id, int issueNumber) {
        super(title, author, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" Type: Magazine (Issue #" + issueNumber + ")");
    }
}

class Newspaper extends LibraryItem {
    private String pubFrequency;

    public Newspaper(String title, String author, String id, String pubFrequency) {
        super(title, author, id);
        this.pubFrequency = pubFrequency;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" Type: Newspaper (Frequency: " + pubFrequency + ")");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Clean Code", "Robert C. Martin", "B01", 464),
            new Magazine("National Geographic", "Various", "M22", 1450),
            new Newspaper("The Kathmandu Post", "Various", "N88", "Daily")
        };

        for (LibraryItem item : items) {
            item.getInfo();
        }
    }
}
