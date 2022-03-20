package sorting;

import java.util.Comparator;

public class Sorting implements Comparator<String[]> {

    public static final int OH = 0;

    @Override
    public int compare(String[] o1, String[] o2) {
        for (int i = 0; i < o1.length; i++) {
            if (o1[i].compareTo(o2[i]) == OH && i + 1 < o1.length) {
                int s = ++i;
                while (o1[s].compareTo(o2[s]) == OH) {
                    s = ++s;
                    return o1[s].compareTo(o2[s]);
                }
            } else return o1[i].compareTo(o2[i]);
        }
        return OH;
    }
}

