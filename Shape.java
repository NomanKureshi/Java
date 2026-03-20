class Shape {
    void area() {
        System.out.println("Area method");
    }
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle Area = " + (3.14*r*r));
    }
}

class Rectangle extends Shape {
    void area() {
        double l = 10, b = 5;
        System.out.println("Rectangle Area = " + (l*b));
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
