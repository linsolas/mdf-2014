package linsolas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercice7Test {

    @Test
    public void input1() {
        Assertions.assertThat(Exercice7.go("<access><blockcode><a><blockcode><blockcode></blockcode></blockcode></a></blockcode></access>")).isEqualTo("(access(blockcode(a(blockcode(blockcode)))))");
    }

    @Test
    public void input2() {
        Assertions.assertThat(Exercice7.go("<a><blockcode></blockcode></a><address><blockcode></address><abbr></abbr></address>")).isEqualTo("E 50 address blockcode");
    }

    @Test
    public void input3() {
        Assertions.assertThat(Exercice7.go("<blockcode><blockcode></blockcode><blockcode></blockcode><abbr><a></a><abbr><a><a><abbr><abbr></abbr></abbr></a></a></abbr></abbr></blockcode>")).isEqualTo("(blockcode(blockcode)(blockcode)(abbr(a)(abbr(a(a(abbr(abbr)))))))");
    }


}
