package test.java;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import main.java.Greeter;

public class GreeterTest {

    @Test
    public void testThatGreeterReturnsTheCorrectGreeting() {
        assertThat(new Greeter().getGreeting()).isEqualTo("Hello, World!");
    }

}
