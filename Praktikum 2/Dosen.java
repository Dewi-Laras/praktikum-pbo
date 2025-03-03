 /*Nama File  : Dosen.java
 * Deskripsi  : berisi atribut dan method dalam class Dosen
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,20 Februari 2025
 */

public class Dosen {
    //atribut
    private String nip;
    private String nama;
    private String prodi;

    //metdhod

    //constructor
    public Dosen(){
        nip = "  ";
        nama = "  ";
        prodi = "  ";
    }
    
    public Dosen (String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selector
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public void setNip(String NIP){
        this.nip = NIP;
    }

    public void setNama(String NAMA){
        this.nama = NAMA;
    }

    public void setProdi(String PRODI){
        this.prodi = PRODI;
    }

}
