package javaapplication5;


public class Radyo {
    
    
    //Sınıfa ait özellikler-- değişkenler.
    //class vairable - sınıf değişkenleri.
    private final static int minSes=0;
    private final static int maxSes=100;
    public int anlikSes;
    public boolean acikKapali;
    private final static double minFrekans=90.0;
    private final static double maxFrekans=105.0;
    public double anlikFrekans;
    public String modelNo;
    public String renk;
    public double boyut;
    
    
    //davranışlar.
    
    public void sesArttir(){
    //ses maxSes ten büyük değilse 5 birim ekle
    //büyükse max ses ver
        if(anlikSes>=maxSes)
        {
            anlikSes=maxSes;
        }
        else
        {
            anlikSes+=5;
        }
    
    }
    public void sesAzalt(){
    //ses minSes ten küçük değilse 5 birim azalt
    //küçükse min ses ver
        if(anlikSes<=minSes)
        {
            anlikSes=minSes;
        }
        else
        {
            anlikSes-=5;
        }
    
    }
    
    
    public void sesKapat()
    {
    anlikSes=minSes;
    }
    
    
     public void acKapa()
        {
            acikKapali = !acikKapali;
        }
    
    public void frekansArttir()
    {
        //frekans max frekansa geldiğinde min frekans yap
        
    if(anlikFrekans>=maxFrekans)
    {
    anlikFrekans=minFrekans;
    }
    else
    {
    anlikFrekans+=0.5;
    }
    
    }
    public void frekansAzalt()
    {
        //frekans min frekansa geldiğinde max frekans yap
        
    if(anlikFrekans<=minFrekans)
    {
    anlikFrekans=maxFrekans;
    }
    else
    {
    anlikFrekans-=0.5;
    }
    
    }
    
    public void frekansDegistir(double gelenFrekans)
    {
    if(gelenFrekans>=minFrekans || gelenFrekans<=maxFrekans)
    {
    anlikFrekans=gelenFrekans;
    }
    }
    
    public void uret(String modelNo, String renk, double boyut){
    
        this.modelNo=modelNo;
        this.renk=renk;
        this.boyut=boyut;
    }
    
    public void durumYazdir()
    {
        System.out.println("Anlık ses Durumu: "+this.anlikSes);
        System.out.println("Frekansı: "+this.anlikFrekans);
        System.out.println("Açık mı: "+this.acikKapali);
        System.out.println("Model: "+this.modelNo);
        System.out.println("Renk: "+this.renk);
        System.out.println("Boyut: "+this.boyut);
    }
    
}
