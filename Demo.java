class Demo {
    {   // IIB
        System.out.println("IIB executed");
    }

    Demo() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        new Demo();
    }
}
