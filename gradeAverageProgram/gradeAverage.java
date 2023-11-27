import  java.util.Scanner;
public class notOrtalamasiProgrami {
    public static void main(String[] args) {
        // Değişkenleri oluştur

        int mat, fizik, kimya, turkce, muzik, tarih ;
        // scanner sınıfını oluşturma
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri İste
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        int Toplam = (mat + fizik + kimya + turkce + muzik + tarih);
        double ortalama = Toplam / 6;
        System.out.println("Ortalamanız : " + ortalama);


        String sonuc = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(sonuc);







    }
}
