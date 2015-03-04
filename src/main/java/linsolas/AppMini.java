package linsolas;

import java.util.*;

public class AppMini {

    public static void main(String[] argv) throws Exception {
        String line;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            /* Lisez les données et effectuez votre traitement */
        }
        /* Vous pouvez aussi effectuer votre traitement une fois que vous avez lu toutes les données.*/
    }



    // Split lines
    public static int[]getLineAsIntArray(String line){String[]a=line.split(" ");int[]res=new int[a.length];int i=0;for(String x:a){res[i++]=Integer.parseInt(x);}return res;}
    public static double[]getLineAsDoubleArray(String line){String[]a=line.split(" ");double[]res=new double[a.length];int i=0;for(String x:a){res[i++]=Double.parseDouble(x);}return res;}

    // Join
    public static String join(Object...objects){StringBuilder sb=new StringBuilder();for(Object o:objects){sb.append(o);}return sb.toString();}
    public static String joinWithString(Object... objects) {return joinWithSeparator(" ", objects);}
    public static String joinWithSeparator(Object separator, Object... objects) {StringBuilder sb = new StringBuilder();for (Object o : objects){sb.append(o).append(separator);}return sb.toString().trim();}

    public static String[] split(String str, char... separators) {String sep = "[";for (char c : separators) {sep += c;}sep += "]+";String[] array = str.split(sep);return Arrays.copyOfRange(array, 1, array.length);}

    // Find min / max
    public static int findMin(int...values){int min=values[0];for(int x:values){if(x<min){min=x;}}return min;}
    public static int findMax(int...values){int max=values[0];for(int x:values){if(x>max){max=x;}}return max;}
    public static double findMin(double...values){double min=values[0];for(double x:values){if(x<min){min=x;}}return min;}
    public static double findMax(double...values){double max=values[0];for(double x:values){if(x>max){max=x;}}return max;}

    // Manipulate occurrences
    private static Map<Object,Integer>occurrences=new HashMap<Object,Integer>();
    public static<K,V extends Comparable<?super V>>Map<K,V>sortByValue(Map<K,V>map,final boolean inverse){List<Map.Entry<K,V>>list=new LinkedList<Map.Entry<K,V>>(map.entrySet());Collections.sort(list,new Comparator<Map.Entry<K,V>>(){public int compare(Map.Entry<K,V>o1,Map.Entry<K,V>o2){V v1=o1.getValue();V v2=o2.getValue();int comp=v1.compareTo(v2);if(inverse){comp=-1*comp;}
        if(comp==0){comp=((Comparable)o1.getKey()).compareTo((Comparable)o2.getKey());}
        return comp;}});Map<K,V>result=new LinkedHashMap<K,V>();for(Map.Entry<K,V>entry:list){result.put(entry.getKey(),entry.getValue());}
        return result;}
    public static void clearOccurrences(){occurrences.clear();}
    public static void addOccurrence(Object o){Integer i=occurrences.get(o);if(i==null){occurrences.put(o,1);}else{occurrences.put(o,i+1);}}
    public static int countOccurrences(Object o){Integer i=occurrences.get(o);return i==null?0:i;}
    public static Map<Object,Integer>getOccurences(){return occurrences;}
    public static int findBestOccurrenceCount(){return countOccurrences(findBestOccurrence());}
    public static Object findBestOccurrence(){return getSortedOccurrences().keySet().iterator().next();}
    public static Map<Object,Integer>getSortedOccurrences(){return sortByValue(occurrences,true);}



}
