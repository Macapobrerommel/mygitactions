import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sentences: ");
        String sentence = scanner.next().toLowerCase().trim();

        String[] words = sentence.split(" ");

        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];

        int size = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int index = findWord(uniqueWords, size, word);

            if (index == -1) {
                uniqueWords[size] = word;
                counts[size] = 1;
                size++;
            } else {
                counts[index]++;
            }
        }

        // Find max
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (counts[i] > counts[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("Most frequent word: " + uniqueWords[maxIndex]);
        System.out.println("Count: " + counts[maxIndex]);
    }

    // Find index of word in array
    public static int findWord(String[] arr, int size, String target) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;





    }
}
