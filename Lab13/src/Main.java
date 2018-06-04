import java.time.Clock;
import java.time.DateTimeException;
import java.time.Instant;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.push("12");
        ls.push("53");
        ls.push("3");
        ls.push("1");
        ls.push("45");
        try {
            Instant t = Clock.systemUTC().instant();
            System.out.println("Begin time:  " +t);
        }
        catch (DateTimeException ex){}
        First d = new First("First");
        d.start();
        Second second = new Second(ls,"Second");
        second.start();
        Third third = new Third(ls,"Third");
        third.start();
    }
}