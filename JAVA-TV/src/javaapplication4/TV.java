package javaapplication4;
import java.util.Random;
public class TV {
    
    public int mevcutKanal;
    final static int maxKanal=1000;
    final static int minKanal=1;
    public int anlikSes;
    final static int maxSes=100;
    final static int minSes=0;
    public boolean acKapa;
    public String anlikCozunurluk="FULLHD";
    final static String maxCozunurluk="FULLHD";
    final static String minCozunurluk="HD";
    public int[] favKanallar=new int[10];
    
    //davranışlar
    
    public void kanalSec(int gelenKanal)
    {
    
        if(gelenKanal>=minKanal || gelenKanal<=maxKanal)
        {
        this.mevcutKanal=gelenKanal;
            System.out.println("Kanal değişti :"+"Yeni Kanal :"+this.mevcutKanal);
        }
        else
        {
            System.out.println("Kanal bulunamadı!");
        }
    }
    
    
    public void favKanalKaydet(int [] gelenfavKanal)
    {
        for (int i = 0; i < 10; i++) {
            if(gelenfavKanal[i]>=minKanal || gelenfavKanal[i]<=maxKanal)
            this.favKanallar[i]=gelenfavKanal[i];
        }
        System.out.println("Favori kanallar kaydedildi");
    
    }
    
    public void kanalArtrir()
    {
        
    if(this.mevcutKanal>=maxKanal){
    this.mevcutKanal=minKanal;
    }
    else{
    mevcutKanal++;
    }
    
   }
 
     public void kanalAzalt()
    {
        
    if(this.mevcutKanal<=minKanal){
    this.mevcutKanal=maxKanal;
    }
    else{
    mevcutKanal--;
    }
    
   }
   
     public void RastgeleKanal(){
     
         Random rastgele=new Random();
         this.mevcutKanal=rastgele.nextInt(minKanal,maxKanal+1);
         System.out.println("Rastegele Kanal: "+mevcutKanal);
     }
     
    
     public void sesAttir()
     {
     
         if(anlikSes>=maxSes){
         anlikSes=maxSes;
         }
         else{
         anlikSes+=5;
         }
         
     }
     
     
      public void sesAzalt()
     {
     
         if(anlikSes>=minSes){
         anlikSes=minSes;
         }
         else{
         anlikSes-=5;
         }
         
     }
    
     public void acKapa()
        {
            acKapa = !acKapa;
        }
       
     public void cozunurlukdegistir(){
         
     if(this.anlikCozunurluk.compareTo(maxCozunurluk)==0){
     anlikCozunurluk=minCozunurluk;
     }
     else{
     anlikCozunurluk=maxCozunurluk;
     }
     
    }
      
     public void durumYazdir()
     {
     
         System.out.println("------------------------------");
         System.out.println("TELEVİZYON DURUMU");
         if(acKapa){
             System.out.println("Televizyon açık");
         }
         else{
             System.out.println("Televizyon kapalı");
         }
         
         System.out.println("Çözünürlük : "+this.anlikCozunurluk);
         System.out.println("Ses Seviyesi : "+this.anlikSes);
         System.out.println("Mevcut Kanal : "+this.mevcutKanal);
         //favori kanallar gelecek
         System.out.println("------------------------------");
     }
     
     public void favKanalgoster()
     {
     
         for (int i = 0; i < 10; i++) {
             System.out.println((i+1)+".Favori Kanal: "+this.favKanallar[i]);
         }
         
     }
    
     public void favKanalSec(int secim)
     {
     if(secim>=0 || secim<=10){
        mevcutKanal=favKanallar[secim];
     }
     
     }
     
}