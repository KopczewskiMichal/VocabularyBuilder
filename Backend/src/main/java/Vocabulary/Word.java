package Vocabulary;

import java.time.LocalDateTime;
import java.util.TreeSet;

public final class Word {
    private String word;
    private String definition;
    private String translation;
    private String sentence;
    private PartsOfSpeech partOfSpeech;
    private final TreeSet<String> synonyms = new TreeSet<>();
    private final LocalDateTime creationDateTime = LocalDateTime.now();

    @Deprecated
    public Word(String word, String definition, String translation, String sentence, PartsOfSpeech partOfSpeech) {
        this.word = word;
        this.definition = definition;
        this.translation = translation;
        this.sentence = sentence;
        this.partOfSpeech = partOfSpeech;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                ", translation='" + translation + '\'' +
                ", sentence='" + sentence + '\'' +
                ", partOfSpeech=" + partOfSpeech +
                ", synonyms=" + synonyms +
//                ", creationDateTime=" + creationDateTime +
                '}';
    }
}
