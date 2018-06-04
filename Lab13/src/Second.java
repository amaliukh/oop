import java.time.Clock;
import java.time.DateTimeException;
import java.time.Instant;
import java.util.LinkedList;
import java.util.Random;

class Second extends Thread{
    Thread two;
    LinkedList<String> list;
    String name;
    Second(LinkedList<String> ls, String name){
        list =  ls;
        this.name = name;
    }
    public void run() {
        try {
            Instant t = Clock.systemUTC().instant();
            System.out.println("SECOND THREAD - time:  " +t);
        }catch (DateTimeException ex)
        {
        }
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            String	k = new Integer(rand.nextInt(20) + 1).toString();
            list.push(k);
        }
        System.out.println("SECOND THREAD - add element: "+ list);
    }
    public void start() {
        if(two == null) {
            two = new Thread(this,name);
            two.start();
        }
    }
}