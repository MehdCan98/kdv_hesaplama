import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOrani =0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tutarı Yazınız:");
        tutar= inp.nextDouble();

       double yeni_tutar = tutar + (tutar * kdvOrani);


        if(tutar <=1000)
        {
            kdvOrani = 0.18;
        }

        else {
            kdvOrani = 0.08;
        }

        System.out.print("KDV oranı : " + kdvOrani);
    }
}