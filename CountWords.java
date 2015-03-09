/*
 * Created by Marc Nablu on 9/03/15.
 */
public class CountWords {
    public static void main(String[] args) {
        System.out.println("Manual unit test of WordCounter");
        System.out.println("\"simple.txt has 5 words\"");
        String text = TextReader.load("simple.txt");
        int numberOfWords = countWords(text);
        System.out.println("Actual number of words: " + numberOfWords);

        System.out.println("Manual unit test of WordCounter");
        System.out.println("\"multiline.txt has 9 words\"");
        text = TextReader.load("multiline.txt");
        numberOfWords = countWords(text);
        System.out.println("Actual number of words: " + numberOfWords);
            }

    private static int countWords(String text) {
        int tally = 0;
        for (char i : text.toCharArray()) {
            if (i == ' ' || i == '\n')
                tally++;


        }int numberOfWords = tally + 1;
        return numberOfWords;
    }
}

