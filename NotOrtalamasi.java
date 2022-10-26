import java.util.Scanner;
public class NotOrtalamasi{
    public static void main(String[] args) {
        short matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner puan = new Scanner(System.in);

        System.out.print("Matematik notu:");
        matematik = puan.nextShort();

        System.out.print("Fizik notu:");
        fizik = puan.nextShort();

        System.out.print("Kimya notu:");
        kimya = puan.nextShort();

        System.out.print("Türkçe notu:");
        turkce = puan.nextShort();

        System.out.print("Tarih notu:");
        tarih = puan.nextShort();

        System.out.print("Müzik notu:");
        muzik = puan.nextShort();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        float sonuc = toplam / 6f;

        System.out.println("Batuhan'in not ortalamasi:" + sonuc );
        String kosul = (sonuc >= 60) ? "Batuhan sinifi gecti." : "Batuhan sinita kaldi.";
        System.out.print(kosul);


    }
}