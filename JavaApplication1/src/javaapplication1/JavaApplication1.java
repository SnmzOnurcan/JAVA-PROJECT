
package javaapplication1;
import Bisikletler.*;
import java.util.Scanner;

public class JavaApplication1 
{
    public static void main(String[] args)
    {
       Bisiklet b1 = new Bisiklet();
       Scanner klavye = new Scanner(System.in);
//       b1.durumYazdir();
//       System.out.println("Hızımız: " + b1.getanlikHiz() );
//       b1.setanlikHiz(80);
//       System.out.println("Hızımız: " + b1.getanlikHiz() );
//      
//       Bisiklet b2 = new Bisiklet(30,20.0);
//       b2.durumYazdir();
//
//       Bisiklet b3 = new Bisiklet(30,18.0);
//       b2.durumYazdir();
//       
//        System.out.println("Egim: " + b1.getegim());
//        b1.setegim(30.3);
//        System.out.println("Egim: " + b1.getegim() );
//        System.out.println("Koltuk: " + b1.getkoltukSYüksekligi());
//        b1.setkoltukYüksekligi(1);
//        System.out.println("Koltuk: " + b1.getkoltukSYüksekligi() );
       
//       Bisiklet b3 = new Bisiklet(2,-15.0);
       
       ElektrikliBisikletler e1 = new ElektrikliBisikletler();
       e1.durumYazdir();

    }
}
