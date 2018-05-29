import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Serializator {

    public void serialize(Container ts) throws Exception {
        FileOutputStream fos = new FileOutputStream("temp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ts);
        oos.flush();
        oos.close();
        System.out.println("Контейнер серіалізовано!");
    }
    public Container deserialize() throws Exception {
        FileInputStream fis = new FileInputStream("temp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Container c = (Container)  ois.readObject();
        ois.close();
        System.out.println("Контейнер десеріалізовано!");
        return c;
    }
}