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

		Map<Word, Long> firstTen = Top.sortAndGetTopTen(frequencyTable, 10);

		return firstTen;
	}

}
