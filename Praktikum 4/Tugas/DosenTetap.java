/*  Nama File    : DosenTetap.java
    Deskripsi    : Kelas untuk menyimpan informasi dosen tetap
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, 
                      String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(65).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        Period masaKerja = Period.between(tmt, LocalDate.now());

        return 0.02 * masaKerja.getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("> NIDN             : " + nidn);
        System.out.println("> BUP              : " + formatTanggal(hitungBUP()));
        System.out.println("> Tunjangan        : Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}