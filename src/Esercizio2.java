import java.util.Scanner;

public class Esercizio2 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Inserisci la prima stringa: ");
      String a = scanner.next();
      System.out.println("Inserisci la seconda stringa: ");
      String b = scanner.next();
      System.out.println("Inserisci la terza stringa: ");
      String c = scanner.next();
      String[] first=firstArray(a,b,c);
      String[] second=secondArray(a,b,c);
      for (int i = 0; i < first.length; i++) {
          System.out.println(i + first[i]);
      }
      for (int i = 0; i < second.length; i++) {
          System.out.println(i+second[i]);
      }
  scanner.close();
}

public static String [] firstArray  (String a, String b, String c) {
    String[] first={a,b,c};
     return first;
    }
public static String [] secondArray (String a, String b, String c) {
      String[] second={c,b,a};    return second;
}

}

