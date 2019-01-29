package wordsexerp;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class FrequencyTableTest {

	@Test
	public void shouldHaveLessthanTenValueElements() {
		final List<Word> wordsUnderTest = Arrays.asList(new Word("aaa"), new Word("bbbb"), new Word("bzzz"),
				new Word("baaa"));

		Map<Word, Long> frequencyTable = FrequencyTable.build(wordsUnderTest);

		assertTrue(frequencyTable.size() == wordsUnderTest.size());
	}

	@Test
	public void shouldHaveTenValueElements() {
		final int TEN = 10;

		List<Word> wordsUnderTest = new ArrayList<>();
		for (int i = 0; i < TEN; i++) {
			wordsUnderTest.add(new Word("a" + i));
		}

		Collections.shuffle(wordsUnderTest);

		Map<Word, Long> frequencyTable = FrequencyTable.build(wordsUnderTest);

		assertTrue(frequencyTable.size() == TEN);
	}

	@Test
	public void shouldReturnEmptyListWhenInputIsAnEmptyList() {
		List<Word> wordsUnderTest = Collections.emptyList();

		Map<Word, Long> frequencyTable = FrequencyTable.build(wordsUnderTest);

		assertTrue(frequencyTable.isEmpty());
	}

	/**
	 * This is a test for a boundary condition
	 */
	@Test
	public void shouldHaveTenValueElementsWhenInputConsistsOfTenElements() {
		List<Word> words = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			words.add(new Word("a" + i));
		}
		List<Word> wordsUnderTest = new ArrayList<>();

		final int TEN = 10;

		for (Word word : words) {
			for (int i = 0; i < TEN; i++) {
				wordsUnderTest.add(word);
			}
		}

		Map<Word, Long> frequencyTable = FrequencyTable.build(wordsUnderTest);

		assertTrue(frequencyTable.size() == TEN);
	}

	/**
	 * This is a test for a boundary condition
	 */
	@Test
	public void shouldHaveOneEmptyElementWhenInputConsistsOfEmptyElements() {
		List<Word> wordsUnderTest = new ArrayList<>();
		final int TEN = 10;

		for (int i = 0; i < TEN; i++) {
			wordsUnderTest.add(new Word(""));
		}

		new FrequencyTable();
		Map<Word, Long> frequencyTable = FrequencyTable.build(wordsUnderTest);

		assertTrue(frequencyTable.size() == 1);
	}

	@Test
	public void shouldHaveOneElementWhenInputConsistsOfEqualElements() {
		List<Word> words = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			words.add(new Word("aa"));
		}

		List<Word> wordsUnderTest = new ArrayList<>();

		final int TEN = 10;

		for (int i = 0; i < TEN; i++) {
			wordsUnderTest.add(words.get(i));
		}

		new FrequencyTable();
		Map<Word, Long> frequencyTable = FrequencyTable.build(wordsUnderTest);

		assertTrue(frequencyTable.size() == 1);
	}

}