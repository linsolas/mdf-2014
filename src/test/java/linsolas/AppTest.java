package linsolas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void should_assert_something() {
        assertThat(App.work("")).isEqualTo("");
    }


}
