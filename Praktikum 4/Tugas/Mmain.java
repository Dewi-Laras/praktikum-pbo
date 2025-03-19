/*  Nama File    : Mmain.java
    Deskripsi    : Program utama untuk menampilkan informasi Pegawai, Dosen, DosenTetap, dan DosenTamu
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

public class Mmain {
    public static void main(String[] args) {
        // Pegawai Umum
        System.out.println("=== Informasi Pegawai ===");
        Pegawai pegawai = new Pegawai("7890123456", "Siti", "1980-07-20", "2010-03-15", 4000000.0);

        pegawai.printInfo();
        System.out.println();

        // Dosen 
        System.out.println("=== Informasi Dosen ===");
        Dosen dosen = new Dosen("5678901234", "Dr. Rina", "1978-09-12", "2003-08-25", 7000000.0, "Fakultas Teknik");

        dosen.printInfo();
        System.out.println();

        // Dosen Tetap
        System.out.println("\n=== Informasi Dosen Tetap ===");
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", "1990-05-05", "2015-01-01", 5000000.0, "Fakultas Sains dan Matematika", "78647324");

        dosenTetap.printInfo();
        System.out.println();

        // Dosen Tamu
        System.out.println("\n=== Informasi Dosen Tamu ===");
        DosenTamu dosenTamu = new DosenTamu("1234567890", "Budi", "1985-08-15", "2018-06-10", 4500000.0, "Fakultas Teknik", "12398765", "2026-12-31");

        dosenTamu.printInfo();
    }
}