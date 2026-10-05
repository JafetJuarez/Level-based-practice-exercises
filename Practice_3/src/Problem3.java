/*
Steps to follow:
- Add the number in box 2 to the number in the box indicated by the number in box 8, and place the total in box 4.
- Multiply the number in box 7 by the number in box 7, and place the result in box 7.
- Is the number in box 4 equal to the number in box 9?
- NO: Add the number in box 4 to the number in box 1, and place the total in box 4.
- Then, subtract the number in box 2 from the number in box 7, and place the result in box 7.
- Repeat instruction 2.
- YES: Add the number in box 3 to the number in box 9, and place the total in box 10.
- Subtract the number in box 10 from the number in box 7, and place the result in box 11.

What is now in box 11?
 */

public class Problem3 {

    public Problem3() {

        int[] box = {2,1,8,4,6,5,2,12,6,19,1,1};

        box[3] = box[1] + box[box[7]-1];
        box[6] = box[6] * box[6];

        while(box[3] != box[8]){
            box[3] = box[3] + box[0];
            box[6] = box[6] - box[1];
            box[6] = box[6] * box[6];
        }

        box[9] = box[2] + box[8];
        box[10] = box[6] - box[9];

        System.out.println("In the box 11 is: "+box[10]);

    }
}
