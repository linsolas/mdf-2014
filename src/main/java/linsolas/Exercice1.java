package linsolas;

public class Exercice1 {

    public static String go(String... lines) {
        String[] colors = new String[]{"orange", "jaune", "vert", "rose", "bleu", "violet"};
        int count = 0;
        for (String line : lines) {
            count = (count + Integer.parseInt(line)) % colors.length;
        }
        return colors[count-1 % 6];
    }

}
