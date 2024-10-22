package lab3task1;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver hexObserver = new HexaObserver(subject);
        OctalObserver octObserver = new OctalObserver(subject);
        BinaryObserver binObserver = new BinaryObserver(subject);

        System.out.println("First state change: 15");	
        subject.setState(15);
        
        // Detach the binary observer
        subject.detach(binObserver);
        
        System.out.println("Second state change: 10");	
        subject.setState(10);  // Only hex and octal observers should be notified
    }
}
