class Person {
    public String pub = "Public";
    private String pri = "Private";
    protected String pro = "Protected";
    String def = "Default";

    void show() {
        System.out.println(pub);
        System.out.println(pri);
        System.out.println(pro);
        System.out.println(def);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.show();
    }
}
