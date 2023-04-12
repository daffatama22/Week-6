import transportasi.*;
import id.ac.dinus.lib.*;
import id.ac.dinus.test.*;

public class TransportasiDemo {
    public static void main(String[] args) {

        MyLibJava my = new MyLibJava();
        my.cetak();
        YourLib y = new YourLib();
        y.cetak2();
        HisLib h = new HisLib();
        h.cetak3();

        Mobil m = new Mobil();
        m.oke();
        Bicycle b = new Bicycle();
        b.oke2();
        System.out.println("Ini isi Tranportasi Demo");
        
    }
}
