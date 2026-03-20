interface Shape1 {
    void area();
}

class Circle1 implements Shape1 {
    public void area() {
        double r = 5;
        System.out.println("Circle Area = " + (3.14*r*r));
    }
}

class Rectangle1 implements Shape1 {
    public void area() {
        double l = 8, b = 4;
        System.out.println("Rectangle Area = " + (l*b));
    }
}

class TestShape1 {
    public static void main(String[] args) {
        Shape1 s1 = new Circle1();
        Shape1 s2 = new Rectangle1();

        s1.area();
        s2.area();
    }
}
