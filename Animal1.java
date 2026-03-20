class Animal1 {
    void eat() { System.out.println("Animal eats"); }
}

class Mammal extends Animal1 {
    void walk() { System.out.println("Mammal walks"); }
}

class Dog1 extends Mammal {
    void bark() { System.out.println("Dog barks"); }

    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.walk();
        d.bark();
    }
}
