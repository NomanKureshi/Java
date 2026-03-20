class MaxRecursion {

    static int findMax(int[] a, int n) {
        if(n == 1)
            return a[0];

        return Math.max(a[n-1], findMax(a, n-1));
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        System.out.println("Maximum = " + findMax(a, a.length));
    }
}
