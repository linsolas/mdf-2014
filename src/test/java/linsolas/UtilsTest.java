package linsolas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UtilsTest {

    @Test
    public void should_convert_line_to_list_of_int() {
        int[] array = App.getLineAsIntArray("0 3400 2100 1400 1500 1600");
        assertThat(array).hasSize(6).contains(0, 3400, 2100, 1400, 1500, 1600);
    }

    @Test
    public void should_convert_line_to_list_of_double() {
        double[] array = App.getLineAsDoubleArray("0 3400.1 12.3 1400 1500 1600");
        assertThat(array).hasSize(6).contains(0, 3400.1, 12.3, 1400, 1500, 1600);
    }

    @Test
    public void should_concatenate() {
        assertThat(App.concatenate("Hello", "World")).isEqualTo("HelloWorld");
    }

    @Test
    public void should_concatenate_with_string_separation() {
        assertThat(App.concatenateWithStringSeparation("Hello", "World")).isEqualTo("Hello World");
    }


    private void init_occurrences () {
        App.clearOccurrences();
        App.addOccurrence("bar");
        App.addOccurrence("foo");
        App.addOccurrence("foo");
        App.addOccurrence("lol");
        App.addOccurrence("foo");
        App.addOccurrence("bar");
    }

    @Test
    public void should_find_occurrences_count() {
        init_occurrences();
        assertThat(App.countOccurrences("foo")).isEqualTo(3);
        assertThat(App.countOccurrences("bar")).isEqualTo(2);
        assertThat(App.countOccurrences("baz")).isEqualTo(0);
    }
    @Test
    public void should_find_best_occurrence_is_foo() {
        init_occurrences();
        assertThat(App.findBestOccurrence()).isEqualTo("foo");
    }
    @Test
    public void should_find_best_occurrence_count() {
        init_occurrences();
        assertThat(App.findBestOccurrenceCount()).isEqualTo(3);
    }

    @Test
    public void should_find_min_int() {
        assertThat(App.findMin(1, 4, -2, 4, 9, 0)).isEqualTo(-2);
    }
    @Test
    public void should_find_max_int() {
        assertThat(App.findMax(1, 4, -2, 4, 9, 0)).isEqualTo(9);
    }

    @Test
    public void should_find_min_double() {
        assertThat(App.findMin(1, 4.2, -2.3, 4, 9.0, 0)).isEqualTo(-2.3);
    }
    @Test
    public void should_find_max_double() {
        assertThat(App.findMax(1, 4, -2, 4, 9.1, 9.0)).isEqualTo(9.1);
    }


    @Test
    public void should_split_with_multiples_separator () {
        assertThat(App.split("<a><b><c>", '<', '>')).containsExactly("a", "b", "c");
    }

}
