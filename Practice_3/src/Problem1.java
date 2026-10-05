/*
Steps to follow:
- Add the number in box 4 to the number in box 2 and place the total in box 7.
- Add the number in box 7 to the number in box 6 and place the total in box 6.
- Multiply the number in box 6 by the number in box 1 and place the product in box 5.

What is now in box 5?

 */

public class Problem1 {
    public Problem1() {
        //Simulation of the box
        int[] box = {6,3,9,2,11,2,91,48,66,1};

        box[6] = box[3] + box[1];
        box[5] = box[6] + box[5];
        box[4] = box[5] * box[0];
        System.out.println("In box 5 is: "+box[4]);
    }
}
