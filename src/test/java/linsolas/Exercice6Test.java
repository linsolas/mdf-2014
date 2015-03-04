package linsolas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class Exercice6Test {

    @Test
    public void input1() {
        Assertions.assertThat(Exercice6.go("Un mot.",
                "Un autre mot.",
                "Encore un autre mot, utile.")).containsExactly("2 autre",
                "1 encore",
                "1 utile");
    }

    @Test
    public void input2() {
        Assertions.assertThat(Exercice6.go("Une phrase avec des mots.",
                "Une autre phrase avec des mots.",
                "Des mots, encore des mots.")).containsExactly("2 avec",
                "2 phrase",
                "2 une");
    }

    @Test
    public void input3() {
        Assertions.assertThat(Exercice6.go("Les mots sont importants. L'ordre ne l'est pas.",
                "Les espaces  entre les MOTS ne sont pas importants.",
                "Les Mots , les espaces et Majuscules ne sont pas  importants.")).containsExactly("2 espaces",
                "1 entre",
                "1 est");
    }


}
