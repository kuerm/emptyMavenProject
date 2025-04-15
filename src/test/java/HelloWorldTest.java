import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {
    @Test
    void todo() {
        var testee = new HelloWorld();

        var actual = testee.act();

        assertThat(actual).isEqualTo("Hello World!");
        assertThat(actual).isEqualTo("Hello World!");
    }
}
