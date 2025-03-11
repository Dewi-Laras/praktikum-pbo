 /*Nama File  : ExceptionOnArray.java
 * Deskripsi  : berisi atribut dan method dalam class ExceptionOnArray
 * Pembuat    : Dewi Larasati Mumpuni / 24060123140045
 * Tanggal    : Kamis,6 Maret 2025
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
    //instansiasi object array integer
    Integer[] arrayInteger = new Integer [4];
    try{
        arrayInteger [2] = 11;
        arrayInteger [4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally {
        System.out.println("clean up code...");
        }
    }  
}
