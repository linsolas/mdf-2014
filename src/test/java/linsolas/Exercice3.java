package linsolas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Exercice3Test {

    @Test
    public void input1 () {
        assertThat(Exercice3.go("bbddb")).isEqualTo("bbddb");
    }
    @Test
    public void input2 () {
        assertThat(Exercice3.go("cccccfffdd")).isEqualTo("5c3fdd");
    }
    @Test
    public void input3 () {
        assertThat(Exercice3.go("eeeeeaaaaa")).isEqualTo("5e5a");
    }

}
