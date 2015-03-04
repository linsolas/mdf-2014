package linsolas;

public class Exercice3 {


    private static char current = ' ';
    private static int count = 0;


    public static String go(String line) {
        StringBuffer sb = new StringBuffer();

        char[] chars = line.toCharArray();
        boolean first = true;
        for (char c : chars) {
            if (first) {
                current = c;
                count = 1;
                first = false;
            } else {
                if (c == current) {
                    count++;
                } else {
                    if (count == 1) {
                    } else if (count == 2) {
                        sb.append(current);
                    } else {
                        sb.append(count);
                    }
                    sb.append(current);
                    count = 1;
                    current = c;
                }
            }
        }
        if (count == 1) {
        } else if (count == 2) {
            sb.append(current);
        } else {
            sb.append(count);
        }
        sb.append(current);


        return sb.toString();
    }

}
