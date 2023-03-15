public class Program { 
      
    public static void main (String args[]){
        
        Book book = new Book("The Lord of the Rings");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        
        fromAvailableStatusMover.moveToStatus(book, Status.ARCHIVED);

        System.out.println(book.getStatus());

        fromAvailableStatusMover.moveToStatus(book, Status.AVAILABLE);

        System.out.println(book.getStatus());


        // BookMover fromBorrovedStatusMover = new FromBorrovedStatusMover();

        // fromBorrovedStatusMover.moveToStatus(book, Status.OVERDUED);
        
        // System.out.println(book.getStatus());
    
    }
}