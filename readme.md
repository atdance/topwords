# Top ten words

A command-line Java program that counts unique words from a text file and lists the top 10 occurrences.
Use English locale and treat hyphen and apostrophe as part of a word.

App is started from wordsexerp.WordApplication

## Frequency Table
Uses the concept of Frequency Table. It is implemented in 
https://github.com/atdance/topwords/blob/master/src/main/java/wordsexerp/FrequencyTable.java

The Java API has examples of alternative implementations of a Frequency Table here:
- [LongAdder](https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/concurrent/atomic/LongAdder.html)
- [autoboxing] (https://docs.oracle.com/javase/8/docs/technotes/guides/language/autoboxing.html)

## Libraries used
- maven
- maven-failsafe-plugin
- Junit
- Java SE 8
