import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kasa kasa = new Kasa();
        kasa.kasaId=156894;

        Kasiyer kasiyer = new Kasiyer();
        kasiyer.kasiyerId=541;
        kasiyer.kasiyerName="Ahmet";
        kasiyer.kasiyerSurname="Gök";
        kasiyer.kasiyerIseBaslamaTarihi="22/12/1999";

        Urun urun = new Urun();
        urun.urunId="888";
        urun.urunAdi="Kolonya";
        urun.urunFiyat=55.99;
        urun.urunBarkod="9876543210";

        Urun urun2 = new Urun();
        urun2.urunId="788";
        urun2.urunAdi="Sakız";
        urun2.urunFiyat=5.99;
        urun2.urunBarkod="0123456789";

        Urun urun3 = new Urun();
        urun3.urunId="789";
        urun3.urunAdi="Sigara";
        urun3.urunFiyat=73.55;
        urun3.urunBarkod="5829";

        List<Urun>urunler = new ArrayList<Urun>();
        urunler.add(urun);
        urunler.add(urun2);
        urunler.add(urun3);


        Musteri musteri1 = new Musteri();
        musteri1.musteriId=1234;
        musteri1.musteriAdi="Hüseyin";
        musteri1.musteriNumberPhone="5511334742";

        Musteri musteri2 = new Musteri();
        musteri2.musteriId=5858;
        musteri2.musteriAdi="Büşra";
        musteri2.musteriNumberPhone="5418554745";

        double ilkUrun=55.99;
        double ikinciUrun=5.99;
        double ucuncuUrun=73.55;

        double toplama=(ilkUrun + ikinciUrun + ucuncuUrun);
        // System.out.println("ToplamaSonucu="+toplama);
         kasa.kasiyer=kasiyer;


        Fis fis1 = new Fis();
        fis1.urunler=new ArrayList<>();
        fis1.fisId=1234;
        fis1.fisTarih="11/09/2024";
        fis1.urunler.add(urun);
        fis1.urunler.add(urun2);
        double fis1Amount=calculatorFisTutar(fis1.urunler);
        fis1.amount=fis1Amount;
        fis1.kdv=calculatorFisToplam(fis1.amount);



        Fis fis2 = new Fis();
        fis2.urunler=new ArrayList<>();
        fis2.fisId=585400;
        fis2.fisTarih="21/09/2024";
        fis2.urunler.add(urun2);
        double fis2Amount=calculatorFisTutar(fis2.urunler);
        fis2.amount=fis2Amount;
        System.out.println(fis2Amount);
        fis2.kdv=calculatorFisToplam(fis2.amount);
        System.out.println(fis2.kdv);
        fis2.totalAmount= fis2.amount+fis2.kdv;
        System.out.println(fis2.totalAmount);

    }
    public static double calculatorFisTutar(List<Urun> urunler) {
        double result=0;
        for (int i = 0; i < urunler.size(); i++) {
            Urun urun = urunler.get(i);
            result=result+urun.urunFiyat;

        }
        return result;


    }
   public  static double calculatorFisToplam(double amount){
        return amount*0.20;

   }
}



