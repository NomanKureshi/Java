class GarbageDemo {
    void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        GarbageDemo g = new GarbageDemo();
        g = null;
        System.gc();   // request JVM to call finalize()
    }
}
