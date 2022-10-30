import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {


        int matematik, turkce, fizik, muzik, kimya, temp;
        double ortalama, count = 5.0;

        Scanner getGrade = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        temp = getGrade.nextInt();
        matematik = (temp > 0 && temp <= 100) ? temp : 0;
        count = (matematik == 0) ? (count - 1) : count;

        System.out.print("Turkce Notunuz:");
        temp = getGrade.nextInt();
        turkce = (temp > 0 && temp <= 100) ? temp : 0;
        count = (turkce == 0) ? (count - 1) : count;

        System.out.print("Fizik Notunuz:");
        temp = getGrade.nextInt();
        fizik = (temp > 0 && temp <= 100) ? temp : 0;
        count = (fizik == 0) ? (count - 1) : count;

        System.out.print("Muzik Notunuz:");
        temp = getGrade.nextInt();
        muzik = (temp > 0 && temp <= 100) ? temp : 0;
        count = (muzik == 0) ? (count - 1) : count;

        System.out.print("Kimya Notunuz:");
        temp = getGrade.nextInt();
        kimya = (temp > 0 && temp <= 100) ? temp : 0;
        count = (kimya == 0) ? (count - 1) : count;

        ortalama = (matematik+ turkce + fizik + muzik + kimya) / count;
        if (ortalama >= 55) {
            System.out.println("Ortalama " + ortalama + " ile gectiniz...");
        } else {
            System.out.println("Ortalama " + ortalama + " ile sinifta kaldiniz..." );
        }
    }
}
