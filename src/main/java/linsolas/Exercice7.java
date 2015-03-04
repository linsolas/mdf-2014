package linsolas;

import java.util.Stack;

public class Exercice7 {

    public static String go(String... lines) {

        Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        int count = 0;


        for (String line : lines) {
            String[] tags = line.split("[<>]+");

            for (String tag : tags) {
                if (tag.startsWith("/")) {
                    tag = tag.substring(1);
                    String expected = stack.pop();
                    if (tag.equals(expected)) {
                        sb.append(')');
                        count += tag.length() + 3;
                    } else {
                        // ERROR
                        return "E " + count + " " + tag + " " + expected;
                    }

                } else if (!"".equals(tag)) {
                    stack.push(tag);
                    sb.append('(').append(tag);
                    count += tag.length() + 2;
                }
            }
        }


        return sb.toString();
    }

}
