class OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        while(count < 100) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }
    }
}
