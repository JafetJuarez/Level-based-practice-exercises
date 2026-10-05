public class Problem4 {
    public Problem4() {
        int[] box = {9,8,6,2,11,3,-3,12,8,-2,4,-6,6};
        // Segundo número de casilla de la instrucción 2
        int secondBox = 13;

        do {

            // Instrucción 1
            // Casilla 7 - casilla cuyo número está en casilla 6
            box[11] = box[6] - box[box[5] - 1];

            // Instrucción 2
            // Casilla 12 + segunda casilla
            box[11] = box[11] + box[secondBox - 1];

            //System.out.println("Casilla 12: " + box[11]);

            // Instrucción 3
            if (box[11] % 5 == 0) {
                break;
            }

            // Instrucción 4
            secondBox = secondBox - box[box[10] - 1];

            // Instrucción 5
            if (box[1] < secondBox) {

                // Instrucción 6
                box[8] = box[8] - 1;

            } else {
                break;
            }

        } while (true);

        System.out.println("In the box 12 is: " + box[11]);

    }
}
