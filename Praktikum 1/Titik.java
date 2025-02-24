 /*Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,20 Februari 2025
 */

 public class Titik {
    //atribut
    double absis;
    double ordinat;
    static int counterTitik = 0;
    
    //method
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    //untuk mengeluarkan nilai titik tengah 
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

    void geser(double x, double y){
        absis =  absis + x;
        ordinat = ordinat + x;
    }

    double getKuadran(){
        if (absis >= 0 && ordinat >=0){
            return 1;
        }
        else if (absis <= 0 && ordinat >=0){
            return 2;
        }
        else if (absis <= 0 && ordinat <=0){
            return 3;
        }
        else{
            return 4;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(absis*absis + ordinat*ordinat);
    }

    double getJarak(Titik T2){
        return Math.sqrt(((T2.absis-absis)*(T2.absis-absis))+((T2.ordinat-ordinat)*(T2.ordinat-ordinat)));
    }

    void RefleksiX(){
        ordinat = ordinat*(-1);
    }

    Titik getRefleksiX(){
        return new Titik(getAbsis(), getOrdinat()*-1);
    }

    void RefleksiY(){
        absis = absis*(-1);
    }

    Titik getRefleksiY(){
        return new Titik(getAbsis()*-1, getOrdinat());
    }

    void printTitik(){
        System.out.println("Titik(" + absis + "," + ordinat + ")");
    }
}
//end class Titik