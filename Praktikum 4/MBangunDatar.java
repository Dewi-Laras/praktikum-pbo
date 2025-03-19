/*  Nama File    : MBangunDatar.java
    Deskripsi    : Program utama untuk menampilkan informasi BangunDatar, Persegi dan Lingkaran
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

public class MBangunDatar {
    public static void main(String[] args) {
        // Bangun Datar
        System.out.println("\n=== Membuat Objek Bangun Datar ===");
        BangunDatar b1 = new BangunDatar(4, "Merah", "Hitam");
        BangunDatar b2 = new BangunDatar(3, "Biru", "Putih");
        BangunDatar b3 = new BangunDatar(); 

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
        BangunDatar.printCounterBangunDatar();
        
        // Objek Persegi
        Persegi P1 = new Persegi();
        Persegi P2 = new Persegi(3, "Hijau", null);
        Persegi P3 = new Persegi(4, "Kuning", "Jingga");

        // Objek Lingkaran
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran(4, "Ungu", "Hitam");
        Lingkaran L3 = new Lingkaran(4, "Pink", "Merah");

        // Menampilkan informasi objek yang dibuat
        P2.printInfo();
        L2.printInfo();

        P3.printInfo();
        L3.printInfo();

        // Menampilkan objek dengan Konstructor default (tidak akan mencetak jika tidak diatur nilai defaultnya)
        P1.printInfo();
        L1.printInfo();
    }
}
