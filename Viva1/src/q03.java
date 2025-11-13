import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of inquiries: ");
        int q = input.nextInt();
        int[] height = new int[q];
        String[] style = new String[q]; 
        for (int i = 0; i < q; i++) {
            System.out.println("Enter the <height> and the <style> for query " + (i + 1));
            height[i] = input.nextInt();
            style[i] = input.next();
        }

        for (int i = 0; i < q; i++) {
            if (style[i].equalsIgnoreCase("A")) {
                for (int j = 1; j <= height[i]; j++) {
                    for (int k = 1; k <= j; k++) System.out.print(j);
                    System.out.println();
                }
            } else if (style[i].equalsIgnoreCase("P")) {
                for (int j = 1; j <= height[i]; j++) {
                    for (int k = 1; k <= height[i] - j; k++) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= j; k++) {
                        System.out.print(k);
                    }
                    for (int k = j - 1; k >= 1; k--) {
                        System.out.print(k);
                    }
                    System.out.println();
                }
            } else System.out.println("Invaild style for query " + (i + 1));
        }
    }
}
