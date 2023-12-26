package javaapplication6;

//nesnelerin argüman olarak iletilmesi

public class BankaHesabi {
    
    //müşteri ad,soyad,kimlik,bakiye,sube
    //davranışlar paraçek,parayatir
    //bakiye kimlik private
    //kapsülleme
    //constructor2x
    
    public String M_ad;
    public String M_Soyad;
    private String kimlik;
    private double bakiye;
    public String Sube;

    public String getKimlik(){
    return kimlik;
    }
    
    public void setKimlik(String kimlikNo){
    this.kimlik=kimlikNo;
    }
    
    public double getBakiye(){
    return bakiye;
    }
    
    public void setBakiye(double bakiye){
        
        
        this.bakiye=bakiye;
    }
    
    
    public BankaHesabi(String Mad,String MSoyad, String MKimlik,double bakiye,String Sube){
        
        this.M_ad=Mad;
        this.M_Soyad=MSoyad;
        setKimlik(MKimlik);
        this.Sube=Sube;
        setBakiye(bakiye);
        
        
    }
    
    public BankaHesabi(){
        
    this.M_ad="anonim";
    this.M_Soyad="deneme";
    this.Sube="Beylikdüzü";
    setKimlik("1111111111");
    setBakiye(14.02);
    
    }
    
    public void girisYap(){
        System.out.println("--------------------------------------------");
        System.out.print("Kimliğiniz: "+getKimlik());
        System.out.println("");
        System.out.println("Adınız: "+M_ad);
        System.out.println("");
        System.out.println("Soyadınız: "+M_Soyad);
        System.out.println("");
        System.out.println("Bakiyeniz: "+getBakiye());
        System.out.println("");
        System.out.println("Şube :"+Sube);
        System.out.println("");
        System.out.println("Giriş yapıdı.");
        System.out.println("--------------------------------------------");
    }
    
    public void ParaCek(double cekilen){
    
        if(getBakiye()-cekilen>0 && cekilen>0){
            
        setBakiye((getBakiye()-cekilen));
            System.out.println("Para çekildi Kalan Para: "+getBakiye());
        }
        
        else{
            
            System.out.println("Bakiye yetersiz");
            
        }
    }
    public void ParaYatir(double yatirilan){
    
        if(yatirilan>0){
        setBakiye(getBakiye()+yatirilan);
            System.out.println("Para yatırma işlemi tamamlandı :"+getBakiye());
        }
        else{
            System.out.println("Geçersiz tutar");
        }
        
    }
    
     
    public void ParaTranfer(BankaHesabi gonderen,BankaHesabi alici,double tutar)
    {
        
        
        if(gonderen.getBakiye()>=tutar)
        {
            
        gonderen.setBakiye(gonderen.getBakiye()-tutar);
        
        alici.setBakiye(alici.getBakiye()+tutar);
            System.out.println("Gönderen Hesap bilgileri");
            gonderen.girisYap();
            System.out.println("Alıcı Hesap bilgileri");
            alici.girisYap();
        }
        else
        {
            System.out.println("Yetersiz Baikiye");
        }
        
        
    }
    
}
