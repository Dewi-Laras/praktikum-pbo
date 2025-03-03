 /*Nama File  : Kendaraan.java
 * Deskripsi  : berisi atribut dan method dalam class Kendaraan
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,20 Februari 2025
 */

public class Kendaraan {
    //atribut
    private String noPlat;
    private String jenis;
    
    //method

    //constructor
    public Kendaraan(){
        noPlat = "  ";
        jenis = "  ";
    }
    
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selector
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String NOPLAT){
        this.noPlat = NOPLAT;
    }

    public void setJenis(String JENIS){
        this.jenis = JENIS;
    }
}
