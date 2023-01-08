import java.util.Scanner;

    public class TaksimetreHesap
    {
    public static void main (String[]args)
    {

        int km;
        double perKm = 2.20 , total , startPrince = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM Cinsinden Yazınız: ");
        km=input.nextInt();

        total= (km * perKm);
        total += startPrince;

        total= (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total + " TL Olarak Hesaplanmıştır...");

    }
}
