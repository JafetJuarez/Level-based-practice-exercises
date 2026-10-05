/*
- Reste 1 del número que está en la casilla 10 y ponga la resta en la casilla 10
 */



public class Problem5 {
    public Problem5() {

        int[] box = {2,11,-9,3,0,12,4,9,5,1,1,4};
        int secondInstructionTwo = 9;
        int firstInstructionTwo = 2;

        box[9] = box[9] - 1;

//        System.out.println("En la casilla 10 está: "+box[9]);

        do {
            box[firstInstructionTwo - 1] = box[secondInstructionTwo - 1];

//            System.out.println("En la casilla 3 está: "+box[2]);

            if (secondInstructionTwo % 2 != 0) {
                secondInstructionTwo -= 1;
            }

//            System.out.println("El segundo número de casilla es: "+secondInstructionTwo);

            box[9] = box[9] + box[3];

//            System.out.println("En la casilla 10 está ahora: "+box[9]);

            firstInstructionTwo += box[10];
            secondInstructionTwo -= box[10];

//            System.out.println("El primer número de casilla es: "+firstInstructionTwo);
//            System.out.println("El segundo número de casilla es: "+secondInstructionTwo);
//            System.out.println("-----------------------------------------------------------------------");
        } while (firstInstructionTwo != box[11]);

        System.out.println("En la casilla 3 está el número: "+box[2]);
        System.out.println("En la casilla 10 está el numero: "+box[9]);

    }
}
