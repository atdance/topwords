package wordsexerp;

import java.util.List;
import java.util.Map;

/**
 * Encapsulates FrequencyTable and Top classes to apply synchronized on their
 * calls.
 */
public class TopSortedWords {

	public synchronized Map<Word, Long> getWords(List<Word> words) {

		Map<Word, Long> frequencyTable = FrequencyTable.build(words);

		return Top.sortAndGetTopWords(frequencyTable, 10);
	}

}
