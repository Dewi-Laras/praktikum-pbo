/*  Nama File    : Datum.java
    Deskripsi    : Kelas generik yang merepresentasikan wadah
                   untuk menyimpan satu data bertipe generik T. 
    Pembuat      : Dewi Larasati Mumpuni / 24060123140045
    Tanggal      : 13 Mei 2025 
*/

public class Datum <T> {
    private T isi;
    
    public Datum(){
        this.isi = null;
    }

    public Datum(T isi){
        this.isi = isi;
    }

    public T getIsi(){
        return isi;
    }

    public void setIsi(T isi){
        this.isi = isi;
    }

    @Override
    public String toString(){
        if(isi == null){
            return "Datum Kosong";
        }
        return "\nDatum berisi : " + isi.toString();
    }
}
