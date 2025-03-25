/*  Nama File    : Main.java  
    Deskripsi    : Program utama untuk menguji BangunDatar, Persegi, dan Lingkaran  
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045 
    Tanggal      : Selasa, 25 Maret 2025  
*/

    public class Main {
        public static void main(String[] args) {
            // Membuat objek bangun datar
            BangunDatar P1 = new Persegi(10);
            Persegi P2 = new Persegi(5);
            BangunDatar L1 = new Lingkaran(7);
            Lingkaran L2 = new Lingkaran(14);
    
            // Cetak informasi
            P1.printInfo();
            P2.printInfo();
            L1.printInfo();
            L2.printInfo();
    
            // Membandingkan luas dan keliling
            System.out.println("\n=== Perbandingan Luas ===");
            System.out.println("> Apakah P1 dan P2 memiliki luas yang sama? " + P1.isEqualLuas(P2));
            System.out.println("> Apakah P1 dan L1 memiliki luas yang sama? " + P1.isEqualLuas(L1));
            System.out.println("> Apakah L1 dan L2 memiliki luas yang sama? " + L1.isEqualLuas(L2));
    
            System.out.println("\n=== Perbandingan Keliling ===");
            System.out.println("> Apakah P1 dan P2 memiliki keliling yang sama? " + P1.isEqualKeliling(P2));
            System.out.println("> Apakah P1 dan L1 memiliki keliling yang sama? " + P1.isEqualKeliling(L1));
            System.out.println("> Apakah L1 dan L2 memiliki keliling yang sama? " + L1.isEqualKeliling(L2));
            System.out.println("\n");
        }
    }