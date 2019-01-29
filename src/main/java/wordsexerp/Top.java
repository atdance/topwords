package wordsexerp;

import static java.util.stream.Collectors.toMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Utility that retrieves top elements of a list of text words.
 */
public class Top {

	/**
	 * Sorting of map entries by value.
	 * 
	 * @param map
	 *            a map to be sorted and filtered
	 * @param maxSize
	 * @return the sorted top 10 entries in the map
	 */
	static Map<Word, Long> sortAndGetTopTen(Map<Word, Long> map, long maxSize) {

		final LinkedHashMap<Word, Long> res = map.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(maxSize)
				.collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		return res;
	}

}