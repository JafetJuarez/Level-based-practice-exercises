public class Problem6 {

    public Problem6() {

        int[] box = casilla11();
        int lastInstructionOne = 4;

        do {
            box[lastInstructionOne - 1] = box[0] - box[0];
            System.out.println("En la casilla número "+lastInstructionOne+" hay un "+box[lastInstructionOne - 1]);
            lastInstructionOne += 2;
        } while (lastInstructionOne != box[10]);

        System.out.println("FIN");

    }

    public static int[] casilla11 (){

        int box11 = 0;
        int[] box = {7,9,2,2,8,4,1,-9,-3,6,box11,4};

        int lastInstructionOne = 4;

        do {
            box[lastInstructionOne - 1] = box[0] - box[0];
            //System.out.println("En la casilla número "+lastInstructionOne+" hay un "+box[lastInstructionOne - 1]);
            lastInstructionOne += 2;
        } while (box[3] != 0 || box[5] != 0 || box[7] != 0);

        box11 = lastInstructionOne;
        box[10] = box11;

        System.out.println("En la casilla número 11 tiene que tener el número: "+box11);
         return box;
    }

}
