package javaapplication6;
import javaapplication6.BankaHesabi;
public class JavaApplication6 {

    public static void main(String[] args) {
       
    BankaHesabi m1=new BankaHesabi("onur","sönmez","3123431451",245.42,"Beylikdüzü");
    BankaHesabi m2=new BankaHesabi("ayşe","demir","71423431451",733.42,"Avcılar");
    
    m1.girisYap();
    m1.ParaYatir(2000);
    m1.girisYap();
    
    m2.girisYap();
    m2.ParaCek(35.67);
    m2.girisYap();
    m1.ParaTranfer(m1, m2, 200);
    }
    
}
