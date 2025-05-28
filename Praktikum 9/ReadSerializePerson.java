import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerializePerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("Person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("Sophie Cantik:" + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
