package javaapplication4;
import javaapplication4.TV;

public class JavaApplication4 {

    
    public static void main(String[] args) {
       
        TV t1=new TV();
        
        System.out.println("Televizyon");
        t1.durumYazdir();
        t1.acKapa();
        t1.cozunurlukdegistir();
        t1.kanalSec(123);
        t1.durumYazdir();
        t1.sesAttir();
        t1.sesAttir();
        t1.sesAttir();
        t1.RastgeleKanal();
        int[] kanallar={10,2,46,24,77,744,523,421,123,895};
        t1.favKanalKaydet(kanallar);
        t1.favKanalgoster();
        t1.favKanalSec(5);
        t1.durumYazdir();
    }
    
}
