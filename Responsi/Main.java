/*  Nama File    : Main.java
    Deskripsi    : Program utama untuk menampilkan informasi ruang departemen, ruang kelas,
                   ruang laboratorium, dan ruang dosen. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 27 Maret 2025
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //menampilkan ruang LabKomputer
        LabKomputer labKomputer = new LabKomputer("LAB01", 10, 8, 4, 30, "Lab Komputer", 200000, 20);
        labKomputer.tampilkanInfo();

        //menampilkan ruang Non-Komputer
        LabNonKomputer labBiologi = new LabNonKomputer("LAB02", 12, 9, 4, 25, "Lab Biologi", 150000, Arrays.asList("Biologi Dasar", "Genetika"));
        labBiologi.tampilkanInfo();

        //menampilkan ruang Dosen
        RuangDosen ruangDosen = new RuangDosen("RD01", 5, 4, 3, 2, "Dr. Kaz Brekker", 2, 1, 7000);
        ruangDosen.tampilkanInfo();

        //menampilan ruang Kelas
        RuangKelas ruangKelas = new RuangKelas("RK01", 8, 6, 3, 40, 35, 5);
        ruangKelas.tampilkanInfo();
        
        //menampilkan ruang departemen
        RuangDepartemen ruangDepartemen = new RuangDepartemen("RDPT01", 6, 5, 3, 10, 4, 6, 2, "Informatika", "Prof. Jesper Fahey", 6000);
        ruangDepartemen.tampilkanInfo();

        System.out.println("\n");
    }
}