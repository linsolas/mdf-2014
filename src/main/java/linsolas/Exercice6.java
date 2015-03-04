package linsolas;

import java.util.Map;

public class Exercice6 {


    public static  String[] go(String... lines) {
        int nbOfLignes = lines.length;
        App.clearOccurrences();

        for (String line : lines) {
            String[] mots = line.split("[ ',]+");
            for (String mot : mots) {
                String m = mot.toLowerCase();
                m = m.replace('.', ' ').replace(',', ' ').trim();
                if (m.length() > 1) {
                    App.addOccurrence(m);
                }
            }
        }
        Map<Object, Integer> occ = App.getSortedOccurrences();

        String[] rez = new String[3];
        int i = 0;
        for (Object o : occ.keySet()) {
            int count = occ.get(o);
            if (count < nbOfLignes) {
                rez[i++] = count + " " + o;
            }
            if (i == 3) {
                break;
            }
        }
        return rez;
    }

}
