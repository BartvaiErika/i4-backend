package week6programming;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class Story {
    public static final int MAXIMUM_TITLE_LENGTH =120;
    public static final int MINIMUM_TITLE_LENGTH =2;
    private String title;
    private Set<Character>characters = new HashSet<>(MINIMUM_TITLE_LENGTH);

    public Story(String title) {
        assertBellowMaximumLentth(title);
        this.title = title;
    }

    private void assertBellowMaximumLentth(String title) {
        if (title .length() > MAXIMUM_TITLE_LENGTH) {
            throw new IllegalArgumentException("Title is too long");
        }
    }

    public String getTitle() {
        return title;
    }

    public void add(Character character) {
        characters.add(character);
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public List<String>getCharacterNames() {
        return characters.stream().map(Character::getName).collect(Collectors.toList());

    }
}
