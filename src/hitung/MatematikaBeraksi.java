
package hitung;


public class MatematikaBeraksi {
    public static void main(String[] args){
        //membuat objek
        Matematika aca = new Matematika(2, 5);
        
        System.out.println("Hasil penjumlahan: "+aca.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+aca.setPengurangan());
        System.out.println("Hasil perkalian: "+aca.setPerkalian());
        System.out.println("Hasil pembagian: "+aca.setPembagian());
    }
    
}
