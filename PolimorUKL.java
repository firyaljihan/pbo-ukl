package polimorukl;
public class PolimorUKL {// class
    public static void main(String[] args) {
        Induk obj = new Ketik ();
        System.out.println(obj.roda());
        
        obj= new Induk();
        System.out.println(obj.roda());
    }
    
}
//method yg sma dipanggil dengan aksi yang berbeda
//objek = obj, banyak bentuk= obj bisa jadi anak dan ketik
//method = public int roda, aksi yang berbeda = nilai return yang berbeda
//tanpa inharitance tidak polimorphysme
//ove

