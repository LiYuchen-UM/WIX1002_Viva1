
import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of inquiries: ");
        int q = input.nextInt();
        int[] a = new int[q];
        int[] b = new int[q];
        int[] n = new int[q];
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the <Initial Value>, the <Multiplier Seed>, <Charm Length> for query " + (i + 1) + ":");
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            n[i] = input.nextInt();
        }
        System.out.println("Result:");
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < n[i]; j++) {
                int out = a[i] + b[i] * (int)Math.pow(2, j);
                System.out.print(out + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
