 /*Nama File  : Mahasiswa.java
 * Deskripsi  : berisi atribut dan method dalam class Mahasiswa
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,20 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    
    //atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //method

    //constructor
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi; 
        this.listMatKul = new ArrayList<>();
    }

    public String getNIM(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public ArrayList<MataKuliah> getListMatkul(){
        return listMatKul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setNIM(String NIM){
        this.nim = NIM;
    }

    public void setNama(String NAMA){
        this.nama = NAMA;
    }

    public void setProdi(String PRODI){
        this.prodi = PRODI;
    }

    public void setidMatkul(ArrayList<MataKuliah>listMatKul){
        this.listMatKul = listMatKul;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    } 

    public void addMatkul (MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public int getJumlahSKS(){
        int sum = 0;
        int i;
        for(i=0; i<listMatKul.size(); i++){
            sum = sum + listMatKul.get(i).getSks();
        }
        return sum;
    }

    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama :" + nama);
        System.out.println("Prodi :" + prodi);
    }

    public void printDetailMhs(){
        System.out.println("\n===== Mahasiswa =====");
        System.out.println("- NIM        : " + nim);
        System.out.println("- Nama       : " + nama);
        System.out.println("- Prodi      : " + prodi);
        System.out.println("- Nama matkul: ");
        int i; 
        for (i=0; i<listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }

        System.out.println("\n===== Dosen ======");
        System.out.println("- Nip dosen wali  : " + dosenWali.getNip());
        System.out.println("- Nama dosen wali : " + dosenWali.getNama());
        System.out.println("- Prodi dosen wali: " + dosenWali.getProdi());

        System.out.println("\n===== Kendaraan =====");
        System.out.println("- No plat: " + kendaraan.getNoPlat());
        System.out.println("- Jenis  : " + kendaraan.getJenis());
    }
}
