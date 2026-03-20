import java.util.Scanner;

class DollarToRupee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        double inr = usd * 83;   // Assume 1 USD = 83 INR
        System.out.println("Amount in INR = " + inr);
    }
}
