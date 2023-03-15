public class FromBorrovedStatusMover extends BookMover {

    protected void moveToStatus(Book book, Status requestedStatus) {

        switch(requestedStatus) {
            case AVAILABLE:
                System.out.println("Moving status from BORROVED to AVAILABLE is not possible");
                break;

            case BORROWED:
                System.out.println("Moving status from BORROVED to BORROWED is not possible");
                break;

            case OVERDUED:
                book.status = Status.OVERDUED;
                break;

            case ARCHIVED:
                book.status = Status.ARCHIVED;
                break;
        }
    }
}