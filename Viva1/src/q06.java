import java.util.Scanner;

public class q06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of words and your compressed words:");
        int t = input.nextInt();
        String[] word = new String[t];
        for (int i = 0; i < t; i++) word[i] = input.next().toLowerCase();
        for (int i = 0; i < t; i++) {
            int log = 0;
            for (int j = 0; j < word[i].length() - 1; j++) {
                char c1 = word[i].charAt(j);
                char c2 = word[i].charAt(j + 1);
                // check c1 is not digit
                if (c1 < 'a' || c1 > 'z') {
                    log = -1;
                    break;
                }
                // if digit in c2 than add it
                if (c2 >= '2' && c2 <= '9') {
                    log += c2 - '0';
                    j++;
                } else if (c2 >= 'a' && c2 <= 'z') {
                    // if last letter end it
                    if (j == word[i].length() - 2) {
                        log+=2;
                        break;
                    // if not the last check next
                    } else {
                        log++;
                    }
                } else {
                    log = -1;
                    break;
                }
            }
            if (log >= 0) System.out.print(log + " ");
            else System.out.print("Invaild Log ");
        }
        System.out.println();
        input.close();
    }
}