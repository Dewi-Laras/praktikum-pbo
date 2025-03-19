/*  Nama File    : DosenTamu.java
    Deskripsi    : Kelas untuk menyimpan informasi dosen tamu
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, 
                     String fakultas, String nidk, String kontrakBerakhir) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.kontrakBerakhir = LocalDate.parse(kontrakBerakhir);
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("> NIDK             : " + nidk);
        System.out.println("> Kontrak Berakhir : " + formatTanggal(kontrakBerakhir));
        System.out.println("> Tunjangan        : Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}