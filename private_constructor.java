class private_constructor{
    private private_constructor() {
        System.out.println("private constructor called");
    }

    public static void main(String[] args) {
        private_constructor j = new private_constructor();
        System.out.println("hello from class!");
    }
}
