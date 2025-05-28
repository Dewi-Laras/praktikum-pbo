import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Farrel");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}