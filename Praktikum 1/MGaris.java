 /*Nama File  : MGaris.java
 * Deskripsi  : Berisi aplikasi file MGaris.java
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,20 Februari 2025
 */


 public class MGaris {
    public static void main(String[] args) {
        System.out.println("             -- Inisialisasi Garis dan Titik --");
        
        // Membuat garis G1 ((0,0),(1,1))
        Garis G1 = new Garis();
        
        // Membuat garis G2 yang mereferensi G1
        Garis G2 = G1;
        
        // Membuat titik T2 (2,1)
        Titik T2 = new Titik(2, 1);
        
        System.out.println("\n\n===============================================================");
        System.out.println("--> Menampilkan Titik Garis G1");
        G1.printT1T2();
        
        System.out.println("\n===============================================================");
        System.out.println("--> Mengubah Titik T1 pada Garis G1");
        G1.setT1Garis(new Titik(3, 4));
        G1.printT1T2();
        
        System.out.println("\n===============================================================");
        System.out.println("--> Mengubah Titik T2 pada Garis G1");
        G1.setT2Garis(T2);
        G1.printT1T2();
        
        System.out.println("\n===============================================================");
        System.out.println("--> Menghitung dan Menampilkan Panjang dan Gradien Garis");
        System.out.println("Panjang garis: " + G1.getPanjangGaris());
        System.out.println("Gradien garis: " + G1.getGradien());
        
        System.out.println("\n===============================================================");
        System.out.println("--> Menampilkan Titik Tengah Garis");
        System.out.println("Titik tengah garis: " + G1.getTitikTengah());
        
        System.out.println("\n===============================================================");
        System.out.println("--> Mengecek Sejajar atau Tegak Lurus");
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2));
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2));
        
        System.out.println("\n===============================================================");
        System.out.println("--> Menampilkan Rumus Persamaan Garis");
        G1.printRumus();
        System.out.println("\n===============================================================");
    }
}
