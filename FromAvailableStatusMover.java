
public class FromAvailableStatusMover extends BookMover {

    protected void moveToStatus(Book book, Status requestedStatus) {
        //System.out.println("Moving status...");
        if (book.status == Status.AVAILABLE) {
        switch(requestedStatus) {
            case AVAILABLE:
                break;

            case BORROWED:
                System.out.println("Moving status from AVAILABLE to BORROWED is not possible");
                break;

            case OVERDUED:
                System.out.println("Moving status from AVAILABLE to OVERDUDE is not possible");
                break;

            case ARCHIVED:
                book.status = Status.ARCHIVED;
                break;
        }
        } else {
            System.out.println("Book has the status " + book.getStatus() + " instead of AVAILABLE");
        }
    }
}
