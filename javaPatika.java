import java.util.Scanner;

public class javaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m,f,k,t,h,s;
        float ort;
        System.out.println("----Lütfen Notlarınızı Giriniz----");
        System.out.println("");
        System.out.println("Matematik sınavı notunuzu giriniz: ");
        m= input.nextInt();
        System.out.println("Fizik sınavı notunuzu giriniz: ");
        f= input.nextInt();
        System.out.println("Kimya sınavı notunuzu giriniz: ");
        k= input.nextInt();
        System.out.println("Tarih sınavı nıotunuzu giriniz: ");
        h= input.nextInt();
        System.out.println("Türkçe sınavı notunuzu giriniz: ");
        t= input.nextInt();
        System.out.println("Müzik sınavı notunuzu giriniz: ");
        s= input.nextInt();
        System.out.println("");

        int toplam = m+f+k+t+h+s;
        ort = toplam/6;
        System.out.println("Ortalamanız: "+ort);
        String sonuc = ort>=50 ? "Tebrikler Dersten Geçtiniz." : "Maalesef Sınıfta Kaldınız.";
        System.out.println(sonuc);



    }
}
