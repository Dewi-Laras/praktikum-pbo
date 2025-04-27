/*  Nama File    : Anabul.java
    Deskripsi    : Kelas abstrak untuk merepresentasikan Anabul. Kelas ini berisi atribut nama dan method dasar gerak serta bersuara, yang nantinya  
                   akan dioverride oleh kelas turunan seperti Kucing, Anjing, dan Burung.  
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 27 April 2025 
*/

public abstract class Anabul {
    protected String nama;

    public Anabul() {
        this.nama = " ";
    }

    public Anabul(String nama) {
        this.nama = nama;
    } 

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void gerak(){
    }

    public void bersuara(){
    }
}