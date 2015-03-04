package linsolas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercice5Test {

    @Test
    public void input1() {
        Assertions.assertThat(Exercice5.go("4",
                "3 3 0 4 ",
                "2 3 1 3 ",
                "0 0 2 3 ",
                "0 4 1 1 ")).isEqualTo("0 3 1.5 0");
    }

    @Test
    public void input2() {
        Assertions.assertThat(Exercice5.go("8",
                "2 9 8 0 5 2 0 1 ",
                "9 5 4 4 0 9 6 2 ",
                "5 5 8 8 4 8 3 0 ",
                "1 6 6 8 6 5 6 1 ",
                "1 8 7 9 3 0 6 6 ",
                "9 3 1 8 1 1 5 7 ",
                "0 8 7 3 9 9 5 6 ",
                "5 6 8 8 3 1 6 4 ")).isEqualTo("0 9 6.0 8");
    }

    @Test
    public void input3() {
        Assertions.assertThat(Exercice5.go("8",
                "1 6 1 -4 3 -9 2 2 ",
                "-2 8 2 -4 -7 7 1 -8 ",
                "1 -8 4 -2 -6 6 -8 3 ",
                "-9 6 -8 -8 8 -2 9 -7 ",
                "-7 9 -6 -2 -8 -6 -2 -2 ",
                "-2 -5 4 -5 3 -3 2 7 ",
                "7 -6 -2 -8 1 -5 9 5 ",
                "6 8 3 -7 -5 -7 0 9 ")).isEqualTo("-8 8 -2.5 -8");
    }

}
