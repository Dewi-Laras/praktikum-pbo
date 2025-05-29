package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs?useSSL=false&serverTimezone=UTC";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if(koneksi != null){
                    System.out.println("Koneksi Berhasil");
                }
            } catch (SQLException e) {
                System.out.println("Error koneksi: " + e.getMessage());
            }
        }
        return koneksi;
    }

    // Tambahkan method untuk menutup koneksi
    public static void closeConnection() {
        try {
            if (koneksi != null && !koneksi.isClosed()) {
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup");
            }
        } catch (SQLException e) {
            System.out.println("Error tutup koneksi: " + e.getMessage());
        }
    }
}