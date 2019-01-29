package wordsexerp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyTable {

	/**
	 * Builds a frequency table of the words in a list
	 *
	 */
	static Map<Word, Long> build(List<Word> words) {
		final Map<Word, Long> frequencyTable = new HashMap<>(10_000);

		for (Word word : words) {
			Long oldValue = frequencyTable.get(word);
			Long newValue = oldValue == null ? 1 : oldValue + 1;
			frequencyTable.put(word, newValue);
		}

		return frequencyTable;
	}
}