
package Bisikletler;

public class ElektrikliBisikletler extends Bisiklet
{
    public int bataryaSeviyesi;
    final static int maxBatarya=100;
    final static int minBatarya=100;
    public void ElektrikliBisiklet()
    {
        bataryaSeviyesi=60;
    }   
    public void sarjEt(int sarjSuresi)
    {
        if (sarjSuresi+bataryaSeviyesi>maxBatarya)
        {
            bataryaSeviyesi=maxBatarya;
            System.out.println("Şarj Doldu, Çıkarınız");
        }
        else
        {
            bataryaSeviyesi+=sarjSuresi;
        }
    }
    public void durum()
    {
          System.out.println("Şarj Bataryası: " + bataryaSeviyesi);
    }
}
