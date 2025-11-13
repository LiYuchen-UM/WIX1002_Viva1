
import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total number of inquiries: ");
        int q = input.nextInt();
        int[] n = new int[q];
        int[] l = new int[q];
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the <Number> and <Lucky Digit> for query " + (i + 1));
            n[i] = input.nextInt();
            l[i] = input.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int lucky = 0;
            int zero = 0;
            int odd = 0;
            int even = 0;
            while (n[i] != 0) {
                int temp = n[i] % 10;
                n[i] /= 10;
                if (temp == l[i]) lucky++;
                else if (temp == 0) zero++;
                else if (temp % 2 == 1) odd++;
                else even++;
            }
            if (lucky > zero && lucky > odd && lucky > even) System.out.println("LUCKY");
            else if (even > lucky && even > odd & even > zero) System.out.println("BALANCED");
            else if (odd > lucky && odd > zero && odd > even) System.out.println("ENERGETIC");
            else System.out.println("NEUTRAL");
        }
        input.close();
    }
}