/*  Nama File    : Pegawai.java
    Deskripsi    : Kelas dasar untuk pegawai
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir, formatter);
        this.tmt = LocalDate.parse(tmt, formatter);
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = LocalDate.parse(tanggalLahir);
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(String tmt) {
        this.tmt = LocalDate.parse(tmt);
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period masaKerja = Period.between(tmt, sekarang);

        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }

    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");

        return tanggal.format(formatter);
    }

    public void printInfo() {
        System.out.println("> NIP              : " + nip);
        System.out.println("> Nama             : " + nama);
        System.out.println("> Tanggal Lahir    : " + formatTanggal(tanggalLahir));
        System.out.println("> TMT              : " + formatTanggal(tmt));
        System.out.println("> Masa Kerja       : " + hitungMasaKerja());
        System.out.println("> Gaji Pokok       : Rp " + String.format("%,.2f", gajiPokok));
    }
}