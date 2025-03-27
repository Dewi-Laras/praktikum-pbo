/*  Nama File    : LabNonKomputer.java
    Deskripsi    : berisi atribut dan method dalam class LabNonKomputer 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 27 Maret 2025
*/

import java.util.List;

public class LabNonKomputer extends RuangLaboratorium {
    private List<String> daftarMataKuliah;
    
    public LabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                           String namaLaboratorium, double hargaSewa, List<String> daftarMataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa);
        this.daftarMataKuliah = daftarMataKuliah;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("\n==== Informasi Lab Non-Komputer ====");
        System.out.println("> Kode Ruang        : " + kode);
        System.out.println("> Nama Laboratorium : " + namaLaboratorium);
        System.out.println("> Dimensi           : " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("> Kapasitas         : " + kapasitas);
        System.out.println("> Harga Sewa        : Rp " + hargaSewa);
        System.out.println("> Mata Kuliah       : " + String.join(", ", daftarMataKuliah));
        System.out.println("> Biaya Kebersihan  : Rp " + hitungBiayaKebersihan(tarifKebersihan));
    }
}
