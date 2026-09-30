/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String primeraPalabra,
                segundaPalabra;

        System.out.println("Ingrese la primera palabra: ");
        primeraPalabra = entrada.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        segundaPalabra = entrada.nextLine();

        System.out.println("El valor devuelto es: "+compararAnagramas(primeraPalabra,segundaPalabra));
    }

    public static boolean compararAnagramas(String palabra1,
                                            String palabra2) {

        boolean anagrama = false;
        char[] primeraPalabra;
        char[] segundaPalabra;

        String primeraPalabraNormalizada = Normalizer.normalize(palabra1, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        String segundaPalabraNormalizada = Normalizer.normalize(palabra2, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        primeraPalabra = primeraPalabraNormalizada.toLowerCase().toCharArray();
        segundaPalabra = segundaPalabraNormalizada.toLowerCase().toCharArray();

        if (primeraPalabra.length != segundaPalabra.length) {
            System.out.println("Las palabras no son del mismo tamaño (Diferentes cantidades de caracteres).");
        } else if (Arrays.equals(primeraPalabra, segundaPalabra)) {
            System.out.println("Son dos palabras iguales. No pueden ser anagramas");
        } else {
            Arrays.sort(primeraPalabra);
            Arrays.sort(segundaPalabra);
                    if (Arrays.equals(primeraPalabra,segundaPalabra)) {
                        System.out.println("Las palabras son anagramas.");
                        anagrama = true;
                    }else {
                        System.out.println("Las palabras no son anagramas");
                    }
        }

        return anagrama;
    }
}