 /*Nama File  : MataKuliah.java
 * Deskripsi  : berisi atribut dan method dalam class MataKuliah
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,20 Februari 2025
 */

public class MataKuliah {
    //atribut
    private String idMatKul;
    private String nama;
    private Integer sks;

    //method

    //constructor
    public MataKuliah(){
        idMatKul = "  ";
        nama = "  "; 
        sks = 0; 
    }

    public MataKuliah(String idMatKul, String nama, Integer sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //selector
    public String getidMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public Integer getSks(){
        return sks;
    }

    public void setidMatkul(String IDMATKUL){
        this.idMatKul = IDMATKUL;
    }

    public void setNama(String NAMA){
        this.nama = NAMA;
    }

    public void setSks(Integer SKS){
        this.sks = SKS;
    }
    
}
