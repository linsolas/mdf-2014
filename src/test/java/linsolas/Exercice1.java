package linsolas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercice1Test {

    @Test
    public void input1 () {
        assertThat(Exercice1.go("4",
                "1",
                "5",
                "3",
                "2",
                "2",
                "6",
                "2",
                "1")).isEqualTo("jaune");
    }
    @Test
    public void input2 () {
        assertThat(Exercice1.go("6",
                "6",
                "6",
                "5",
                "3",
                "3",
                "2")).isEqualTo("orange");
    }
    @Test
    public void input3 () {
        assertThat(Exercice1.go("3",
                "4",
                "5",
                "3",
                "6",
                "4",
                "1",
                "1",
                "3",
                "4")).isEqualTo("rose");
    }

}
