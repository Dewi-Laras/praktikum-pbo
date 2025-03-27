/*  Nama File    : RuangLaboratorium.java
    Deskripsi    : berisi atribut dan method dalam class RuangLaboratorium
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 27 Maret 2025
*/

public class RuangLaboratorium extends Ruang {
    protected String namaLaboratorium;
    protected double hargaSewa;
    protected static double tarifKebersihan = 5000;

    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, 
                              String namaLaboratorium, double hargaSewa) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLaboratorium;
        this.hargaSewa = hargaSewa;
    }

    public String getNamaLaboratorium() {
        return namaLaboratorium;
    }

    public void setNamaLaboratorium(String namaLaboratorium) {
        this.namaLaboratorium = namaLaboratorium;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    @Override
    public double hitungBiayaKebersihan(double tarif) {
        return super.hitungBiayaKebersihan(tarifKebersihan);
    }
}
