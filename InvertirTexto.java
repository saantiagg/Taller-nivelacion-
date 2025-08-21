import java.util.Scanner;

public class InvertirTexto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba una cadena de texto: ");
        String texto = sc.nextLine(); 

        String textoInvertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);

        }

        System.out.println("Cadena invertida: " + textoInvertido);

        sc.close();
    }

}
