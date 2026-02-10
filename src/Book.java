public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // Параметрлүү конструктор
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }

    // Getter'лер
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Китепти алуу
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Китеп ийгиликтүү алынды.");
        } else {
            System.out.println("Китеп жеткиликтүү эмес.");
        }
    }

    // Китепти кайтаруу
    public void returnBook() {
        isAvailable = true;
        System.out.println("Китеп кайтарылды.");
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Author: " + author +
                ", Year: " + year +
                ", Available: " + isAvailable;
    }

    // equals override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return title.equals(other.title)
                && author.equals(other.author)
                && year == other.year;
    }
}
