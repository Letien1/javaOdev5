import java.util.Scanner;

public class DaireninDilimAlanı {
    public static void main(String[] args) {
        double pi=3.14;
        double r,alan,dilimAcisi,dilimAlani;

        Scanner oku= new Scanner(System.in);
        System.out.println("Yarı Çapı Giriniz: ");
        r=oku.nextDouble();

        alan=pi*r*r;

        System.out.println("Dairenin Açısını Giriniz: ");
        dilimAcisi=oku.nextDouble();
        dilimAlani=(alan*dilimAcisi)/360;

        System.out.println("Dairenin Dilim Alanı: "+dilimAlani);
        System.out.println("Dairenin Alanı: "+alan);
    }
}
