/*  Nama File    : BangunDatarGenericTest.java
    Deskripsi    : Kelas utama untuk menguji penggunaan kelas BangunDatarGeneric dengan berbagai jenis bangun datar 
                   seperti Lingkaran, Persegi, Persegi Panjang, dan Segitiga. 
                   Menampilkan hasil perhitungan keliling, luas, dan tipe objek generic yang digunakan.
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 14 Mei 2025
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {

        // Lingkaran
        Lingkaran l = new Lingkaran(49);
        BangunDatarGeneric<Lingkaran> bdgL = new BangunDatarGeneric<>();
        bdgL.set(l);
        System.out.println("--=== Lingkaran ===--");
        System.out.println(">> keliling     : " + bdgL.hitungKeliling());
        System.out.println(">> luas         : " + bdgL.get().hitungLuas());
        System.out.println(">> tipe generic : " + bdgL.get().getClass().getName());
        System.out.println();

        // Persegi
        Persegi p = new Persegi(10);
        BangunDatarGeneric<Persegi> bdgP = new BangunDatarGeneric<>();
        bdgP.set(p);
        System.out.println("--=== Persegi ===--");
        System.out.println(">> keliling     : " + bdgP.hitungKeliling());
        System.out.println(">> luas         : " + bdgP.get().hitungLuas());
        System.out.println(">> tipe generic : " + bdgP.get().getClass().getName());
        System.out.println(); 

        // Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang(12, 13);
        BangunDatarGeneric<PersegiPanjang> bdgPP = new BangunDatarGeneric<>();
        bdgPP.set(pp);
        System.out.println("--=== Persegi Panjang ===--");
        System.out.println(">> keliling     : " + bdgPP.hitungKeliling());
        System.out.println(">> luas         : " + bdgPP.get().hitungLuas());
        System.out.println(">> tipe generic : " + bdgPP.get().getClass().getName());
        System.out.println();

        // Test Segitiga
        Segitiga s = new Segitiga(5, 5, 3, 3, 4);
        BangunDatarGeneric<Segitiga> bdgS = new BangunDatarGeneric<>();
        bdgS.set(s);
        System.out.println("--=== Segitiga ===--");
        System.out.println(">> keliling     : " + bdgS.hitungKeliling());
        System.out.println(">> luas         : " + bdgS.get().hitungLuas());
        System.out.println(">> tipe generic : " + bdgS.get().getClass().getName());
        System.out.println("\n");
    }
}