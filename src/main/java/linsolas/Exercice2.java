package linsolas;

public class Exercice2 {


    public static int go(String a, String b, String c) {
        int initial = Integer.parseInt(a);
        int[] cases = App.getLineAsIntArray(b);
        int[] des = App.getLineAsIntArray(c);

        int index = 0;
        int position = 0;
        while (initial > 0) {
            int totalDes = des[index] + des[index + 1];
            index += 2;
            position = (position + totalDes) % 40;
            int somme = cases[position];

            System.out.println("Dés : " + des[index - 2] + ", " + des[index - 1] + ": " + position + ". A payer : " + somme + " | restant : " + initial);

            initial -= somme;
        }
        return position + 1;
    }
}
