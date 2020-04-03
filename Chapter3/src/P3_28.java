import java.util.Scanner;

public class P3_28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double distance = Math.pow(((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)) , 0.5);
        //因为本题不涉及到矩形旋转的问题，根据勾股定理，
        // 两个中点的距离小于，长宽差一半的平方之和的开方
        // 幻想的极限情景就是小长方形在大长方形的一角的情景
        if (distance <= (Math.pow((0.25*(height1 - height2)*(height1 - height2) + (0.25*(width1 - width2) * (width1 - width2))) , 0.5))) {
            System.out.println("r2 is inside r1");
        } else if (distance <= Math.max(Math.abs(0.5*(height1 + height2)), Math.abs(0.5 * (width1 + width2)))){
            System.out.println("r2 overlaps r1");
        } else System.out.println("r2 does not overlap r1");

        //This Algorithum is not suitable for second situation.
        /*double x1LeftDown = x1 - (width1 / 2);
        double y1LeftDown = y1 - (height1 / 2);
        double x1LeftUp = x1 - (width1 / 2);
        double y1LeftUp = y1 + (height1 / 2);
        double x1RightDown = x1 + (width1 / 2);
        double y1RightDown = y1 - (height1 / 2);
        double x1RightUp = x1 + (width1 / 2);
        double y1RightUp = y1 + (height1 / 2);

        double x2LeftDown = x2 - (width2 / 2);
        double y2LeftDown = y2 - (height2 / 2);
        double x2LeftUp = x2 - (width2 / 2);
        double y2LeftUp = y2 + (height2 / 2);
        double x2RightDown = x2 + (width2 / 2);
        double y2RightDown = y2 - (height2 / 2);
        double x2RightUp = x2 + (width2 / 2);
        double y2RightUp = y2 + (height2 / 2);

        if ((x2LeftDown >= x1LeftDown) && (y2LeftDown >= y1LeftDown) && (x2LeftUp >= x1LeftUp) && (y2LeftUp <= y1LeftUp)
          && (x2RightDown <= x1RightDown) && (y2RightDown >= y1RightDown) && (x2RightUp <= x1RightUp) && (y2RightUp <= y1RightUp)){
            System.out.println("r2 is inside r1.");
        } else if (((x2LeftDown >= x1LeftDown) && (y2LeftDown >= y1LeftDown)) || ((x2LeftUp >= x1LeftUp) && (y2LeftUp <= y1LeftUp))
                || ((x2RightDown <= x1RightDown) && (y2RightDown >= y1RightDown)) || ((x2RightUp <= x1RightUp) && (y2RightUp <= y1RightUp))){
            System.out.println("r2 overlaps r1.");
        } else System.out.println("r2 does not overlap r1.");

        System.out.println("LeftDown x1: " + x2LeftDown + " , " + x1LeftDown +" , "+ y2LeftDown +" , "+ y1LeftDown);
*/
    }
}
