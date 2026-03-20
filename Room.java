class Room {
    double length, breadth, area;

    Room(double l, double b) {
        length = l;
        breadth = b;
        area = length * breadth;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Room r = new Room(10, 5);
        r.display();
    }
}
