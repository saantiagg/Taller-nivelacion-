import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese una palabra en minusculas: ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra  = palabra.charAt(i);

            if (esLetra(letra)) {
                if (esVocal(letra)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("\nCantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);

        sc.close();
    }

    public static boolean esLetra(char  c) {
        return c >= 'a' && c <= 'z';
    }
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }


   }
        
    
    

