// 已知坐标求边长
// 并利用三边求三角形内角

public class P4_6 {
    public static void main(String[] args){
        final double RADIUS = 40.0;
        final double X_0 = 0.0;
        final double Y_0 = 0.0;

        // To generate first point
        double angle1 = Math.random() * 2 * Math.PI;
        double x1 = RADIUS * Math.cos(angle1);
        double y1 = RADIUS * Math.sin(angle1);

        // To generate first point
        double angle2 = Math.random() * 2 * Math.PI;
        double x2 = RADIUS * Math.cos(angle2);
        double y2 = RADIUS * Math.sin(angle2);

        // To generate first point
        double angle3 = Math.random() * 2 * Math.PI;
        double x3 = RADIUS * Math.cos(angle3);
        double y3 = RADIUS * Math.sin(angle3);

        double side1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double side2 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double side3 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));

        double angleInTriangle1 = Math.acos((side1 * side1 - side2 * side2 - side3 * side3) / (-2 * side2 * side3));
        double angleInTriangle2 = Math.acos((side2 * side2 - side1 * side1 - side3 * side3) / (-2 * side1 * side3));
        double angleInTriangle3 = Math.acos((side3 * side3 - side2 * side2 - side1 * side1) / (-2 * side1 * side2));

        System.out.printf("Three angle in the triangle are: %4.2f, %4.2f, %4.2f .", angleInTriangle1, angleInTriangle2, angleInTriangle3);
    }
}
