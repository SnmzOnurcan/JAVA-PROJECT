package Bisikletler;

public class Bisiklet 
{
    public int frenMiktari;
    final static int maxFren=3;
    public int maxVites;
    final static int minVites=1;
    public int vites;
    final static int minHiz=0;
    private int anlikHiz=100;
    public double egim;
    public int koltukYüksekligi;
    public int yipranma=100;
    
    
//    public int getanlikHiz()
//    {
//        return anlikHiz;
//    }
//    public void setanlikHiz(int hiz) // değiştirmek için
//    {
//        if (anlikHiz>0 && anlikHiz<100)
//        {
//            this.anlikHiz=hiz;
//        }
//    }
     public double getegim()
    {
        return egim;
    }
    public void setegim(double gegim) // değiştirmek için
    {
        if (egim>0 && egim<100)
        {
            this.egim=gegim;
        }
    }
     public int getkoltukSYüksekligi()
    {
        return koltukYüksekligi;
    }
    public void setkoltukYüksekligi(int koltuk) // değiştirmek için
    {
        if (koltukYüksekligi>0 && koltukYüksekligi<3)
        {
            this.koltukYüksekligi=koltuk;
        }
    }
    public Bisiklet()
    {
        this.anlikHiz=50;
        this.vites=2;
        this.egim=2.0;
        this.koltukYüksekligi=2;
        this.frenMiktari=1;
        this.maxVites=18;
    }
    public Bisiklet(int vites)
    {
        this.anlikHiz=0;
        this.vites=vites;
        this.egim=2.0;
        this.koltukYüksekligi=2;
        this.frenMiktari=1;
        this.maxVites=vites;
    }
//     public Bisiklet(int koltuk , double egim)
//    {
//        this.egim=egim;
//        this.koltukYüksekligi=koltuk;
//    }
      public Bisiklet(int fren,int egim)
    {
        this.anlikHiz=0;
        this.vites=vites;
        this.egim=egim;
        this.koltukYüksekligi=2;
        this.frenMiktari=fren;
        this.maxVites=18;
    }
       public Bisiklet(int yıpranma,double egim)
    {
        this.anlikHiz=0;
        this.vites=vites;
        this.egim=egim;
        this.koltukYüksekligi=2;
        this.frenMiktari=1;
        this.maxVites=18;
        this.yipranma=yıpranma;
    }
    public void pedalCevir(int devir, int sertlik)
    {
        if (devir<=0)
        {
            devir=1;
        }
        if (sertlik<=0)
        {
            sertlik=1;
        }
        anlikHiz=devir*(sertlik/vites);
        yipranma-=1;
    }
    public void vitesArtir()
    {
        if (vites+1<maxVites)
        {
            vites=maxVites;
        }
        else
        {
            vites++;
        }
        yipranma-=1;
    }
    public void vitesAzalt()
    {
        if (vites-1<minVites)
        {
            vites=minVites;
        }
        else
        {
            vites--;
        }
        yipranma-=1;
    }
    public void koltukSeviyesi(double boy)
    {
        if (boy>=1.80)
        {
            koltukYüksekligi=1;
        }
        else if (boy>=1.70)
        {
            koltukYüksekligi=2;
        }
        else
        {
            koltukYüksekligi=3;
        }
        yipranma-=1;
    }
     public void egimDurum(int egim)
    {
        try
        {
        this.egim=egim;
        if (this.egim>0)
        {
            anlikHiz-=(this.egim/2);
        }
        else
        {
            anlikHiz+=(this.egim/2);
        }
        if (anlikHiz<=minHiz)
        {
            anlikHiz=minHiz;
        }
        }
        catch(Exception e)
        {
            System.out.println("İşlem Başarısız!!");
        }
        yipranma-=1;
    }
    public void frenDegisitr()
    {
        if (frenMiktari+1>maxFren)
        {
            frenMiktari=maxFren;
        }
        else
        {
            frenMiktari++;
        }
        yipranma-=2;
    }
    public void frenYap()
    {
        if (anlikHiz<0)
        {
            anlikHiz=minHiz;
        }
        else
        {
            anlikHiz-=frenMiktari*5;
        }
        yipranma-=2;
    }
    public void durumYazdir()
    {
        System.out.println("Bisiklet");
        System.out.println("Bisiklet Hızı: " + this.anlikHiz);
        System.out.println("Bisiklet Eğimi: " + this.egim);
        System.out.println("Bisiklet Fren Miktari: " + this.frenMiktari);
        System.out.println("Bisiklet Vites Miktari: " + this.maxVites);
        System.out.println("Bisiklet Koltuk Miktari: " + this.koltukYüksekligi);
        System.out.println("Bisiklet Yıpranma Miktari: " + this.yipranma);
    }
}
