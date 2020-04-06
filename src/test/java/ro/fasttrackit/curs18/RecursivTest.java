package ro.fasttrackit.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecursivTest {
    Recursiv recursiv;

    @BeforeEach
    void setup() {
        recursiv = new Recursiv();
    }

    @Test
    @DisplayName("WHEN null is received THEN throw IllegalArgumentException")
    void ifNullThenException() {
        assertThrows(IllegalArgumentException.class, () -> recursiv.length(null));
    }

    @Test
    @DisplayName("WHEN empty string is received THEN 0 is returned")
    void emptyString() {
        assertThat(recursiv.length("")).isEqualTo(0);
    }

    @Test
    @DisplayName("WHEN single letter word is received THEN 1 is returned")
    void singleLetter() {
        assertThat(recursiv.length("a")).isEqualTo(1);
    }

    @Test
    @DisplayName("WHEN a longer word is received THEN its lenght is returned")
    void longWord() {
        assertThat(recursiv.length("averylongword")).isEqualTo(13);
    }


}

// empty string return 0 : RED
// empty string return 0 : GREEN
