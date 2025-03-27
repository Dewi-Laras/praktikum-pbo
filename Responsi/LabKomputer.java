/*  Nama File    : LabKomputer.java
    Deskripsi    : berisi atribut dan method dalam class LabKomputer
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 27 Maret 2025
*/

public class LabKomputer extends RuangLaboratorium {
    private int jumlahKomputer;
    
    public LabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                        String namaLaboratorium, double hargaSewa, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa);
        this.jumlahKomputer = jumlahKomputer;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("\n==== Informasi Lab Komputer ====");
        System.out.println("> Kode Ruang        : " + kode);
        System.out.println("> Nama Laboratorium : " + namaLaboratorium);
        System.out.println("> Dimensi           : " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("> Kapasitas         : " + kapasitas);
        System.out.println("> Harga Sewa        : Rp " + hargaSewa);
        System.out.println("> Jumlah Komputer   : " + jumlahKomputer);
        System.out.println("> Biaya Kebersihan  : Rp " + hitungBiayaKebersihan(tarifKebersihan));
    }
}
