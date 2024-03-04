import java.util.Scanner;




public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo: ");
        double l = scanner.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo: ");
        double w = scanner.nextDouble();
        System.out.println("Il perimetro del rettangolo è: " + perimeter(l, w));
        System.out.println("Inserisci un numero intero: ");
        int n = scanner.nextInt();
        System.out.println("Il numero " + n + " è pari? " + pari(n));
    }

public static double perimeter(double l, double w) {
        return 2 * (l + w);}

    public static int pari(int n) {        if(n %2==0) {
        return 0;
    } else

    {
        return 1;
    }
}
}



