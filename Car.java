class Car {
    String brand, model;
    int year;

    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    void setBrand(String b) { brand = b; }
    void setModel(String m) { model = m; }
    void setYear(int y) { year = y; }

    void display() {
        System.out.println(brand + " " + model + " (" + year + ")");
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla", 2022);
        c.display();
    }
}
