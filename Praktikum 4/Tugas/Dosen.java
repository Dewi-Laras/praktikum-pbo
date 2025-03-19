/*  Nama File    : Dosen.java
    Deskripsi    : Kelas untuk menyimpan informasi dosen
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : Kamis, 13 Maret 2025
*/

public class Dosen extends Pegawai {
    private String fakultas;

    public Dosen(String nip, String nama, String tanggalLahir, String tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("> Fakultas         : " + fakultas);
    }
}