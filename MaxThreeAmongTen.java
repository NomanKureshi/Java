import java.util.Scanner;

class MaxThreeAmongTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++)
            a[i] = sc.nextInt();

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int x : a) {
            if(x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if(x > max2) {
                max3 = max2;
                max2 = x;
            } else if(x > max3) {
                max3 = x;
            }
        }

        System.out.println("Max1 = " + max1);
        System.out.println("Max2 = " + max2);
        System.out.println("Max3 = " + max3);
    }
}
