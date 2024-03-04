import java.util.Scanner;



    public  class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insersci il primo numero");
            int a = scanner.nextInt();
            System.out.println("Insersci il secondo numero");
            int b = scanner.nextInt();
            System.out.println("Il risultato è: " + multiper(a, b));

            System.out.println("Insersci la prima stringa");
            String stringa1 = scanner.next();
            System.out.println("Insersci un numero");
            String stringa2 = scanner.next();
            System.out.println("Il risultato è: " + concat(stringa1, stringa2));
            System.out.println("Insersci la prima stringa");
            String array1 = scanner.next();
            System.out.println("Insersci la seconda stringa");
            String array2 = scanner.next();
            System.out.println("Insersci la terza stringa");
            String array3 = scanner.next();
            System.out.println("Insersci la quarta stringa");
            String array4 = scanner.next();
            System.out.println("Insersci la quinta stringa");
            String array5 = scanner.next();
            System.out.println("Insersci la sesta stringa che andrà alla posizione 3");
            String array6 = scanner.next();
            String[] stringhe= arrayResult(array1, array2, array3, array4, array5);
            String[] newStringhe = arrayResult1(stringhe, array6);
           for (int i = 0; i < newStringhe.length; i++) {
               System.out.println("Risultato"+newStringhe[i]);
           }
          scanner.close();
        }
        public static int multiper(int a, int b) {
            System.out.println("Insersci il primo numero");

            return a * b ;
        }
        public static String concat(String a, String b) {
            return a + b;
        }

        public static String[] arrayResult(String s1,String s2, String s3, String s4, String s5) {
            String [] arrayOfstring  =new String[5];
            arrayOfstring[0] = s1;
            arrayOfstring[1] = s2;
            arrayOfstring[2] = s3;
            arrayOfstring[3] = s4;
            arrayOfstring[4] = s5;



            return arrayOfstring;
        }

        public static String[] arrayResult1(String[] arrayResult,String inner) {
          String[] newarray={arrayResult[0], arrayResult[1], inner, arrayResult[2], arrayResult[3], arrayResult[4]};
           return newarray;
        }
    }

