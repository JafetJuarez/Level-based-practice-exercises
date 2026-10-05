public class Problem7 {

    public Problem7() {

        int[] box = casilla14();

        int instruction1 = 13;

        do {
            box[instruction1 - 1] = box[instruction1 -1] + box[instruction1 - 1];
            System.out.println("Casilla número "+instruction1+" duplicada.");
            instruction1 -= 2;
        } while (box[13] < instruction1);

        System.out.println("FIN");

    }

    public static int[] casilla14(){
        int box14 = 0;
        int[] box = {0,0,0,0,0,0,0,0,0,0,0,0,0,box14,0};
        int instruction1 = 13;

        do {
            box[instruction1 - 1] = box[instruction1 -1] + box[instruction1 - 1];
            instruction1 -= 2;
        } while (instruction1>=7);

        box14 = instruction1 + 1;
        box[13] = box14;

        System.out.println("En la casilla 14 tiene que tener el número: "+box14);

        return box;
    }

}
