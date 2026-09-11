/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */

import java.text.Normalizer;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase;
        boolean respuesta = false;

        System.out.println("Introduzca la frase: ");
        frase = scan.nextLine();

        respuesta = definirPalindromo(frase);

        System.out.println(respuesta);

    }

    public static boolean definirPalindromo(String texto){
        String textoSinTilde;
        String textoSinSignosPuntuacion;
        String textoSinEspacios;
        String textoEnMinuscula;
        String[] textoNormalizado;
        boolean palindromoDefinido = false;

        //Normalizamos el texto recibido
        textoSinTilde = Normalizer
                .normalize(texto,Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        textoSinSignosPuntuacion = textoSinTilde
                .replaceAll("\\p{P}","");
        textoSinEspacios = textoSinSignosPuntuacion.replace(" ","");
        textoEnMinuscula = textoSinEspacios.toLowerCase();

        //Guardamos el texto normalizado en un arreglo
        textoNormalizado = textoEnMinuscula.split("");

        //Creamos un arreglo inverso del texto normalizado
        String[] textoNormalizadoInverso = new String[textoNormalizado.length];
        for(int i=0; i< textoNormalizado.length;i++){
            textoNormalizadoInverso[i]=textoNormalizado[(textoNormalizado.length-1)-i];
        }

        //Comparamos el texto normalizado con el texto normalizado inverso
        for(int i=0;i< textoNormalizado.length;i++){
            if(!(textoNormalizado[i].equals(textoNormalizadoInverso[i]))){
                palindromoDefinido = false;
                break;
            } else {
                palindromoDefinido = true;
            }
        }

        return palindromoDefinido;
    }
}
