
public class Java21Features {
    public static void main(String[] args) {
       
        try {
            // 1. virtual Threads
            Thread t=Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread"));
            t.join();
        } catch (InterruptedException ex) {
        }
        Object obj = new Transaction("Dee","Zee",1000.0);
        processTransaction(obj);
        // 4. Pattern Matching for switcj:- More expensive and type-safe switch statements.
        CustomerMessage message = new Ticket(2020);
        String response = switch(message){
            case TextMessage(String text) -> "Processing text message: "+text;
            case Ticket(int ticketNum) -> "Processing support ticket: #"+ticketNum;
        };
        System.out.println(response);
    }
    // 3. Record Patterns  :- supports deconstruction, including nested patterns
    public static void processTransaction(Object obj){
        if(obj instanceof Transaction(String sender, String reciever, double amount)){
            System.out.println("Processing transaction "+sender+" -> "+reciever+" :$"+amount);
        }
    }
}
