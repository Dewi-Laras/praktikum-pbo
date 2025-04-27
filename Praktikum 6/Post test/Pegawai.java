/*  Nama File    : Pegawai.java
    Deskripsi    : Kelas untuk menentukan nama dan gaji dari pegawai
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 27 April 2025 
*/

class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public Pegawai() {
        this.nama = " ";
        this.gajiPokok = 0;
    }

    public Pegawai(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}