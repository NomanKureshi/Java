class Counter {
    static int count = 0;
    int number;

    Counter() {
        count++;
        number = count;
    }

    void display() {
        System.out.println("Number = " + number + ", Count = " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.display();
        c2.display();
        c3.display();
    }
}
