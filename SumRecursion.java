class SumRecursion {

    static int sum(int[] a, int n) {
        if(n == 0)
            return 0;

        return a[n-1] + sum(a, n-1);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println("Sum = " + sum(a, a.length));
    }
}
