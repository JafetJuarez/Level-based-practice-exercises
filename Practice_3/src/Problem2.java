/*
Steps to follow:
- Place the number from box 8 into box 1.
- Add the number in box 1 to the number in box 2 and place the total in box 1.
- Modify instruction 2 by increasing the second box number mentioned in that instruction by 1.
- Is the second box number mentioned in instruction 2 greater than the number in box 7?
- If not, return to instruction 2 and follow the flow.
- If so, what number is in box 1?
 */

public class Problem2 {
    public Problem2() {

        int[] box = {3,7,2,1,5,12,4,0};
        int increasing = 1;

        box[0] = box[7];


        do{
            box[0] = box[0] + box[increasing];
            increasing++;
        }while(box[increasing] <= box[6]);

        System.out.println("The number of box 1 is: "+box[0]);

    }
}
