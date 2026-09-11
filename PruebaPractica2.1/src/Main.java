public class Main {

    public static boolean esPalindromo(String texto){
        //Convertimos todo a minúscula
        texto = texto.toLowerCase();

        //Quitamos las tildes
        texto = texto
                .replace("á","a")
                .replace("é","e")
                .replace("í","i")
                .replace("ó","o")
                .replace("ú","u");


        //Eliminamos espacios y signos de puntuación
        texto = texto.replaceAll("[^a-z0-9]","");

        //Invertimos el texto
        String invertido = new StringBuilder(texto)
                .reverse()
                .toString();

        //comparamos
        return texto.equals(invertido);
    }

    public static void main(String[] args) {

        System.out.println(esPalindromo("Ana lleva al oso la avellana."));
        System.out.println(esPalindromo("Anita lava la tina"));
        System.out.println(esPalindromo("Hola mundo"));
        System.out.println(esPalindromo("Ánima"));

    }
}