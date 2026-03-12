package calculodemedia;
import java.util.Scanner;
public class CalculoDeMedia {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double n1, n2, n3;

        System.out.println("Digite o valor da primeira nota: ");
        n1 = scr.nextDouble();
        
        System.out.println("Digite o valor da segunda nota: ");
        n2 = scr.nextDouble();
        
        System.out.println("Digite o valor da primeira nota: ");
        n3 = scr.nextDouble();

        CalculoDeMedia.calcularMedia(n1, n2, n3);

    }

    static void calcularMedia(double nt1, double nt2, double nt3) {
        double mediaFinal = (nt1 + nt2 + nt3) / 3;
        System.out.println("A média é de: " + mediaFinal);

    }
}
