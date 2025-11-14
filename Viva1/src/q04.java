
import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next().toLowerCase();
        System.out.println("Enter a length: ");
        int k = input.nextInt();

        String firstWhisper = null;
        String lastEcho = null;
        String coreValue = null;
        int maxAscii = -1;

        for (int i = 0; i <= word.length() - k; i++) {
            String subString = word.substring(i, i + k);

            if (firstWhisper == null || subString.compareTo(firstWhisper) < 0) 
                firstWhisper = subString;

            if (coreValue == null || subString.compareTo(coreValue) > 0) 
                coreValue = subString;

            int ascii = 0;
            for (int j = 0; j < subString.length(); j++) 
                ascii += subString.charAt(j);
            if (ascii > maxAscii) {
                maxAscii = ascii;
                lastEcho = subString;
            }
        }
        System.out.println(firstWhisper + "\t(First Whisper)");
        System.out.println(lastEcho + "\t(Last Echo)");
        System.out.println(coreValue + "\t(Core Value)");
        input.close();
    }
}
