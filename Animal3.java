class Animal3 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog3 extends Animal3 {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal3 a = new Dog3(); // runtime polymorphism
        a.sound();
    }
}
