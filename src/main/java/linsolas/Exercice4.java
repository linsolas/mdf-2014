package linsolas;

public class Exercice4 {

    public static String go(String... lines) {
        int rectangles = Integer.parseInt(lines[0]);

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int i = 1; i <= rectangles; i++) {
            int[] coordonnes = App.getLineAsIntArray(lines[i]);
            int x1 = coordonnes[0];
            int y1 = coordonnes[1];
            int x2 = coordonnes[2];
            int y2 = coordonnes[3];

            if (x1 < minX) { minX = x1; }
            if (x1 > maxX) { maxX = x1; }

            if (y1 < minY) { minY = y1; }
            if (y1 > maxY) { maxY = y1; }

            if (x2 < minX) { minX = x2; }
            if (x2 > maxX) { maxX = x2; }

            if (y2 < minY) { minY = y2; }
            if (y2 > maxY) { maxY = y2; }
        }
        return App.concatenateWithStringSeparation(
                minX, minY,
                minX, maxY,
                maxX, minY,
                maxX, maxY
        );
    }

}
