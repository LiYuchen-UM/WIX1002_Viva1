import java.util.Scanner;

public class q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of words you are entering: ");
        int t = input.nextInt();
        String[] word = new String[t];
        for (int i = 0; i < t; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            word[i] = input.next().toLowerCase();
        }
        for (int i = 0; i < t; i++) {
            boolean notEndWithVowel = true;
            boolean noAdjacentVowel = true;
            char cEnd = word[i].charAt(word[i].length() - 1);
            for (int j = 0; j < word[i].length() - 1; j++) {
                char c1 = word[i].charAt(j);
                char c2 = word[i].charAt(j + 1);
                boolean c1Vowel = false;
                boolean c2Vowel = false;
                if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') c1Vowel = true;
                if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') c2Vowel = true;
                if (c1Vowel == true && c2Vowel == true) noAdjacentVowel = false;
            }
            if (cEnd == 'a' || cEnd == 'e' || cEnd == 'i' || cEnd == 'o' || cEnd == 'u') notEndWithVowel = false;
            if (noAdjacentVowel == true && notEndWithVowel == true) System.out.println("Harmony");
            else System.out.println("Chaos");
        }
        input.close();
    }
}
