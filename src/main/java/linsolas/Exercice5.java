package linsolas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercice5 {


    public static String go(String... lines) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int size = Integer.parseInt(lines[0]);
        int start = size - (size * 3 / 4);
        int end = size - (size / 4);
        App.clearOccurrences();
        List<Integer> allValues = new ArrayList<Integer>();
        for (int i = 1; i <= size; i++) {
            if ((i > start) && (i <= end)) {
                int[] values = App.getLineAsIntArray(lines[i]);

                for (int j = 0; j < values.length; j++) {
                    if (j >= start && j < end) {
                        int x = values[j];
                        if (x > max) {
                            max = x;
                        }
                        if (x < min) {
                            min = x;
                        }
                        App.addOccurrence(x);
                        allValues.add(x);
                    }
                }
            }
        }
        Collections.sort(allValues);
        int n = (allValues.size() / 2) - 1;
        double a = (double) allValues.get(n);
        double b = (double) allValues.get(n + 1);
        double mediane = (a + b) / 2;
        int mode = (Integer) App.findBestOccurrence();
        return App.concatenateWithStringSeparation(min, max, mediane, mode);
    }

}
