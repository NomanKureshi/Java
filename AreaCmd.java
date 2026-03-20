class AreaCmd {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double length = Double.parseDouble(args[1]);
        double breadth = Double.parseDouble(args[2]);

        double circleArea = 3.14 * radius * radius;
        double rectArea = length * breadth;

        System.out.println("Area of Circle = " + circleArea);
        System.out.println("Area of Rectangle = " + rectArea);
    }
}
