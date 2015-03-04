package linsolas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercice4Test {

    @Test
    public void input1 () {
        Assertions.assertThat(Exercice4.go("3",
                "0 5 7 2",
                "4 -2 9 -2",
                "8 -4 6 3")).isEqualTo("0 -4 0 5 9 -4 9 5");
    }

    @Test
    public void input2 () {
        Assertions.assertThat(Exercice4.go("5",
                "10 -2 1 3",
                "10 0 4 2",
                "0 -3 3 -1",
                "6 1 9 5",
                "0 5 5 -5")).isEqualTo("0 -5 0 5 10 -5 10 5");
    }

    @Test
    public void input3 () {
        Assertions.assertThat(Exercice4.go("10",
                "-9 2 2 0",
                "1 5 9 0",
                "-10 1 -3 4",
                "-4 -1 8 -5",
                "-8 -2 -8 -5",
                "-5 4 -8 4",
                "-4 3 2 -3",
                "-8 4 -4 -1",
                "-3 1 5 5",
                "-2 -1 -5 0")).isEqualTo("-10 -5 -10 5 9 -5 9 5");
    }

}
