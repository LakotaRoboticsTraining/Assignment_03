import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void intMethodReturnsSumForDifferentValues() {
        assertEquals(13, Main.add(6, 7),
            "The int method should return the sum of its two arguments.");
    }

    @Test
    void doubleMethodReturnsSumForDifferentValues() {
        assertEquals(4.0, Main.add(1.25, 2.75), 0.0001,
            "The overloaded double method should return the sum of its arguments.");
    }

    @Test
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
            "The void method should use the String argument it receives.");
    }
}
