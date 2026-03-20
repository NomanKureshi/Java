class Area {
    int length;
    int breadth;

    void getdata() {
        int a = length * breadth;
        System.out.println("Area: " + a);
    }
}

class Main {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.length = 5;
        obj.breadth = 6;
        obj.getdata();
    }
}
