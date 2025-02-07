package week3.day1;import org.openqa.selenium.json.StringCoercer;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String text = "We learn Java basics as part of java sessions in java week1";
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")) { // Skip already replaced words
                continue;
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) { // Case-insensitive check for duplicates
                    words[j] = ""; // Replace duplicate word with an empty string
                }
            }
        }

        // Print modified sentence while maintaining spaces
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}



