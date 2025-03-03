 /*Nama File  : MMahasiswa.java
 * Deskripsi  : Berisi aplikasi file MMahasiswa
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,20 Februari 2025
 */

public class MMahasiswa {
    public static void main(String[] args){
        
        //membuat objek MataKuliah
        MataKuliah PBO = new MataKuliah ("PBO", "  > Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah ("MBD", "  > Manajemen Basis Data", 3);

        //membuat objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("324", "Andi", "Informatika");

        //membuat objek Dosen
        Dosen D1 = new Dosen("123", "Parman", "Informatika");

        //membuat objek Kendaraan
        Kendaraan K1 = new Kendaraan("H9908", "Motor");

        //mengatur dosen wali dan kendaraan untuk mahasiswa
        M1.setDosenWali (D1);
        M1.setKendaraan (K1);
        
        // Menambah mata kuliah yang diambil
        M1.addMatkul (PBO);
        M1.addMatkul (MBD);
        
        // Menampilkan detail mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("\n===== Mata Kuliah =====");
        System.out.println("- Jumlah Mata Kuliah    : " + M1.getJumlahMatKul()); 
        System.out.println("- Jumlah SKS Mata Kuliah: " + M1.getJumlahSKS());
    }
}