import java.sql.Connection;
import java.sql.DriverManager;


public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person p) throws Exception {
        String name = p.getName();

         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/PBO", "root","sophie110506");
         
         String query = "INSERT INTO person(name) VALUES ('" + name + "')";
         System.out.println(query);
         java.sql.Statement s = con.createStatement();
         s.executeUpdate(query);
         
         con.close();
    }
}