import java.util.Scanner;

public class notortalamasi {
    public static void main (String[] args){
        Scanner girdi = new Scanner(System.in);
        System.out.print("Türkçe Notunuzu Giriniz: ");
        int turkce =  girdi.nextInt();
        System.out.print("Matematik Notunuzu Giriniz: ");
        int matematik = girdi.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        int fizik = girdi.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        int kimya = girdi.nextInt();
        System.out.print("Tarih Notunuzu Giriniz: ");
        int tarih = girdi.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        int muzik = girdi.nextInt();

        int ortalama = (fizik+kimya+turkce+matematik+muzik+tarih)/6;
        System.out.println("Ortalamanız: "+ortalama);
        System.out.print(ortalama >= 60 ? "Sınıfı Geçti." : "Sınıfta Kaldı." );
    }
}
