package wordsexerp;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordApplication {

	/**
	 * A command-line program that counts unique words from a text file and lists
	 * the top 10 occurrences
	 * 
	 *
	 * Limitations: It has an untested behavior with files that do not contain text
	 * . It does not work with lists of words larger that Integer.MAX_VALUE.
	 *
	 * @param args
	 *            a file path
	 */

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("please provide a file path as argument");
		}

		String fileName = args[0];

		List<Word> words = null;
		try {
			words = DataLoader.loadDataFromFile(fileName);
		} catch (IllegalArgumentException | IOException e) {
			System.out.println("Could not load file " + fileName);
			return;
		}

		Map<Word, Long> firstTen = new TopSortedWords().getWords(words);

		Set<Entry<Word, Long>> entries = firstTen.entrySet();

		for (Entry<Word, Long> entry : entries) {
			System.out.printf("%s (%s)%n", entry.getKey(), entry.getValue());
		}
	}

}