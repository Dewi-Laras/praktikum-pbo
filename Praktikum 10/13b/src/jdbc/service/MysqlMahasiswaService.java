package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    private Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        return new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
    }

    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try (PreparedStatement ps = koneksi.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, mhs.getNama());
            ps.executeUpdate();
            // Ambil ID yang dihasilkan
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mhs.setId(rs.getInt(1)); // Perbarui ID di objek Mahasiswa
            }
        } catch (SQLException e) {
            System.out.println("Error tambah data: " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error update data: " + e.getMessage());
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error hapus data: " + e.getMessage());
        }
    }

    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error ambil data: " + e.getMessage());
        }
        return null;
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error ambil semua data: " + e.getMessage());
        }
        return list;
    }

    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error reset indeks: " + e.getMessage());
        }
    }

    public void clearAll() {
        String query = "TRUNCATE TABLE mahasiswa";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error hapus semua data: " + e.getMessage());
        }
    }

    public boolean isEmpty() {
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try (PreparedStatement ps = koneksi.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            System.out.println("Error cek tabel: " + e.getMessage());
        }
        return true;
    }

    public void closeConnection() {
        MysqlUtility.closeConnection();
    }
}