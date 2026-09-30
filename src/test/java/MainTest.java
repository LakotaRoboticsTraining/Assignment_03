import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Challenge 2: int add returns sum")
    void intMethodReturnsSumForDifferentValues() {
        assertEquals(13, Main.add(6, 7),
            "challenge2 failed - Main.add(6, 7) should return 13 (return the sum of the two ints).");
    }

    @Test
    @DisplayName("Challenge 3: double add returns sum")
    void doubleMethodReturnsSumForDifferentValues() {
        assertEquals(4.0, Main.add(1.25, 2.75), 0.0001,
            "challenge3 failed - Main.add(1.25, 2.75) should return 4.0 (overloaded double add).");
    }

    @Test
    @DisplayName("Challenge 1: greet uses its argument")
    void voidMethodUsesItsStringArgument() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(outputStream));
            Main.greet("Lakota");
        } finally {
            System.setOut(originalOut);
        }

        assertTrue(outputStream.toString().contains("Lakota"),
            "challenge1 failed - greet(\"Lakota\") must print the argument Lakota in the message.");
    }
}
