import java.util.Arrays;
import java.util.Scanner;

class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        System.out.println("Sorted order:");
        for(int x : a)
            System.out.print(x + " ");
    }
}
