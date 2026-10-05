import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Problem8 {

    public Problem8() {

        int[] numeros = {1,2,3};
        List<String[]> numerosLetra = new ArrayList<>();
        List<String[]> opcionCorrecta = new ArrayList<>();
        String casillaGrande, casillaPequeño;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                for (int k = 0; k < numeros.length; k++) {
                    if (i != j && i != k && j != k) {

                        String[] letraAsignada = new String[4];

                        //System.out.println(numeros[i] + "-" + numeros[j] + "-" + numeros[k]);

                        letraAsignada[0] = Integer.toString(numeros[i]);
                        letraAsignada[1] = Integer.toString(numeros[j]);
                        letraAsignada[2] = Integer.toString(numeros[k]);

                        if (!(numeros[k] > numeros[i])) {
                            if (!(numeros[j] > numeros[i])) {
                                if (!(numeros[k] > numeros[j])) {
                                    letraAsignada[3] = "A";
                                } else {
                                    letraAsignada[3] = "B";
                                }
                            } else {
                                letraAsignada[3] = "C";
                            }
                        }else if (!(numeros[j] > numeros[i])) {
                            letraAsignada[3] = "D";
                        } else if (!(numeros[k] > numeros[j])){
                            letraAsignada[3] = "E";
                        } else {
                            letraAsignada[3] = "F";
                        }

                        numerosLetra.add(letraAsignada);
                        //System.out.println("Aquí se guardó: "+Arrays.toString(letraAsignada));

                    }
                }
            }
        }


        //System.out.println(numerosLetra.size());
        for (String[] array : numerosLetra) {
            //System.out.println(Arrays.toString(array));

            if (array[3].equals("C") || array[3].equals("F")) {
                 opcionCorrecta.add(array);
            }
        }

//        for (String[] opcionC : opcionCorrecta) {
//            System.out.println(Arrays.toString(opcionC));
//        }

        if (!(opcionCorrecta.get(0)[0].equals("3") || opcionCorrecta.get(1)[0].equals("3"))) {
            casillaGrande = "casilla 1";
        } else if (!(opcionCorrecta.get(0)[1].equals("3") || opcionCorrecta.get(1)[1].equals("3"))) {
            casillaGrande = "casilla 2";
        } else {
            casillaGrande = "casilla 3";
        }

        if (!(opcionCorrecta.get(0)[0].equals("1") || opcionCorrecta.get(1)[0].equals("1"))) {
            casillaPequeño = "casilla 1";
        } else if (!(opcionCorrecta.get(0)[1].equals("1") || opcionCorrecta.get(1)[1].equals("1"))) {
            casillaPequeño = "casilla 2";
        } else {
            casillaPequeño = "casilla 3";
        }

        System.out.println("La "+casillaGrande+" no puede tener el número más grande.");
        System.out.println("La "+casillaPequeño+" no puede tener el número más pequeño");

    }
}
