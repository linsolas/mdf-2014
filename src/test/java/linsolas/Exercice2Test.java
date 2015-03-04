package linsolas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercice2Test {


    @Test
    public void input1() {
        String a = "20000";
        String b = "0 3400 2100 1400 1500 1600 1800 2700 2500 0 2600 3800 2800 1200 2100 2500 4000 1900 1600 0 2700 1200 2600 3100 2300 1500 1800 2200 3500 1100 3700 3900 3500 1800 1300 4000 2400 2200 2600 4000";
        String c = "3 1 6 1 1 2 4 1 4 5 1 1 6 4 5 2 5 1 5 4 1 4 4 6 6 5 6 3 1 3 2 4 4 2 5 5 4 2 5 1 1 6 2 6 4 1 2 3 1 6";
        Assertions.assertThat(Exercice2.go(a, b, c)).isEqualTo(13);
    }

    @Test
    public void input2() {
        String a = "40000";
        String b = "0 2800 3100 1600 2400 2300 1400 3400 2800 0 1300 1600 1500 2000 3800 3600 3500 1600 3000 0 1900 2700 1400 1800 1500 1500 2700 2800 1900 2700 3000 2700 1400 2100 3300 2800 3500 3800 2200 2200";
        String c = "4 4 4 5 6 4 4 5 5 2 4 1 5 5 2 6 6 5 4 2 3 2 5 4 4 4 1 3 3 4 5 1 1 3 5 6 6 2 4 4 4 2 4 3 6 6 2 5 5 6";
        Assertions.assertThat(Exercice2.go(a, b, c)).isEqualTo(3);
    }

    @Test
    public void input3() {
        String a = "40000";
        String b = "0 1300 3400 2800 3200 1900 3200 1400 3300 0 3900 3400 1900 2100 2500 1500 1800 3500 3300 0 2100 3800 2700 3200 3600 2400 1100 3000 1500 3900 3100 1800 1200 2400 3700 3400 3400 2800 3900 2700";
        String c = "6 6 3 1 2 6 3 4 5 1 3 1 1 1 5 6 3 5 4 4 5 2 6 5 5 5 4 4 3 4 1 2 3 3 3 5 2 5 2 6 6 5 6 6 5 5 5 1 4 2";
        Assertions.assertThat(Exercice2.go(a, b, c)).isEqualTo(37);
    }

}
