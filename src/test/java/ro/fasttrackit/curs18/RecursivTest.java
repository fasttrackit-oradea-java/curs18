package ro.fasttrackit.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
