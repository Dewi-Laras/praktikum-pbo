/*  Nama File    : Datum.java
    Deskripsi    : Kelas yang berisi kumpulan metode generik untuk 
                   memproses objek bertipe Datum<T>. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 13 Mei 2025 
*/

public class ContohMetodeGenerik {

    public <T> void tampilkanDatum(Datum<T> datum) {
        System.out.println(datum);
    }
    
    public <T> void ubahIsi(Datum<T> datum, T isiBaru) {
        datum.setIsi(isiBaru);
        System.out.println("Isi Datum telah diubah " + datum);
    }
    
    public <T extends Anabul> void tampilkanPerilakuAnabul(Datum<T> datum) {
        T anabul = datum.getIsi();
        if (anabul != null) {
            System.out.println(">> Perilaku " + anabul.getNama());
            anabul.suara();
            anabul.gerak();
        } else {
            System.out.println("Datum tidak berisi Anabul!");
        }
    }
    
    public <T> boolean samaDatum(Datum<T> datum1, Datum<T> datum2) {
        if (datum1.getIsi() == null && datum2.getIsi() == null) {
            return true;
        }
        if (datum1.getIsi() == null || datum2.getIsi() == null) {
            return false;
        }
        return datum1.getIsi().equals(datum2.getIsi());
    }
}