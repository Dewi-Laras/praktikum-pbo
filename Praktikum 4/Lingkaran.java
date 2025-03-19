/*  Nama File    : Lingkaran.java
    Deskripsi    : Kelas untuk menghitung luas dan keliling lingkaran
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran() {
        super(0, "Tidak Diketahui", "Tidak Diketahui");
        this.jari = 0.0;
    }

    //super membuat menjadi lebih ringkas
    public Lingkaran (double diameter, String warna, String border){
        super(4, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double Luas(){
        double luas = Math.PI * jari * jari;
        return luas;
    }

    public double Keliling(){
        double keliling = Math.PI * 2 * jari;
        return keliling;
    }

    @Override
    public void printInfo() {
        System.out.println("\n==== Informasi Lingkaran ====");
        System.out.println("> Jari-jari: " + jari);
        System.out.println("> Warna    : " + getWarna());
        System.out.println("> Border   : " + getBorder());
        System.out.println("> Luas     : " + String.format("%.2f", Luas()));
        System.out.println("> Keliling : " + String.format("%.2f", Keliling()));
    }
}
