package javaapplication5;

public class JavaApplication5 {

   
    public static void main(String[] args) {
        
        //sınıftan oluşturulan her bir örneğe nesne denir.
        
        Radyo vestel=new Radyo();
        Radyo r2=new Radyo();
        Radyo r3=new Radyo();
        Radyo r4;
        r4=new Radyo();
        
        System.out.println("Vestel Radyo");
        System.out.println("");
        vestel.durumYazdir();
        vestel.acKapa();
        vestel.sesArttir();
        vestel.sesArttir();
        vestel.sesArttir();
        vestel.frekansDegistir(103.4);
        vestel.durumYazdir();
        vestel.modelNo="dadaf23";
        vestel.renk="mavi";
        
        System.out.println("");
        
        System.out.println("r2 radyosu");
        System.out.println("");
        r2.durumYazdir();
        r2.frekansArttir();
        r2.sesAzalt();
        r2.modelNo="a331";
        r2.renk="yeşil";
        r2.boyut=100.0;
        
        
    }
    
}
