package javaapplication5;

public class araba {

    public int mevcutHiz;
    final static int maxHiz=400;
    final static int minHiz=10;
    public int mevcutKm;
    final static int maxKm=500;
    final static int minKm=0;
    public int mevcutBenzin;
    final static int maxBenzin=60;
    final static int minBenzin=0;
    public int mevcutVites;
    final static int maxVites=5;
    final static int minVites=0;
    public boolean acKapa;
    
    public void hızArttir()
    {
    if(mevcutHiz>=minHiz || mevcutHiz<=maxHiz){
    mevcutHiz+=10;
    }
    }
    
    public void hızAzalt()
    {
    if(mevcutHiz>=minHiz || mevcutHiz<=maxHiz){
    mevcutHiz-=10;
    }
    }
    
    public void kmArttir(){
    if(mevcutKm>=minKm || mevcutKm<=maxKm){
    mevcutKm+=5;
    }
    }
    
    public void benzinDoldur(){
    if(mevcutBenzin>=minBenzin || mevcutBenzin<=maxBenzin){
    mevcutBenzin+=10;
    }
    }
    
    public void vitesArttir(){
    if(mevcutVites>=minVites || mevcutVites<=maxVites){
    mevcutVites++;
    }
    }
    public void vitesAzalt(){
    if(mevcutVites>=minVites || mevcutVites<=maxVites){
    mevcutVites--;
    }
    }
    
    public void calistirDurdur(){
    acKapa =! acKapa;
    } 
    
    public void bosaAl(){
    mevcutVites=minVites;
    }
    public void durumYazdir(){
    
        System.out.println("-------------------------------------------------------------");
        System.out.println("Hız: "+this.mevcutHiz);
        System.out.println("Km : "+this.mevcutKm);
        System.out.println("Kalan Benzin: "+this.mevcutBenzin);
        System.out.println("Vites : "+this.mevcutVites);
        if(mevcutVites==minVites){
            System.out.println("Araba Boşta");
        }
        
        if(acKapa){
            System.out.println("Araba Çalışıyor");
        }
        else{
            System.out.println("Araba Çalışmıyor");
        }
        
        System.out.println("-------------------------------------------------------------");

        
        
    }
    
    
}
