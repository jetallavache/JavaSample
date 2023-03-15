
public class Book {
    String title;
    Status status;

    Book()
    {
        title = "no title";
        status = Status.AVAILABLE;
    }

    Book(String title)
    {
        this.title = title;
        this.status = Status.AVAILABLE;
    }

    public Status getStatus() {
        return this.status;
    }
}
