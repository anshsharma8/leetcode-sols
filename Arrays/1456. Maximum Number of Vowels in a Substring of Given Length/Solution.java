import java.util.*;

class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        HashSet<Character> a = new HashSet<>();
        a.add('a');
        a.add('e');
        a.add('i');
        a.add('o');
        a.add('u');

        for (int i = 0; i < k; i++) {
            if (a.contains(s.charAt(i))) {
                count++;
            }
        }
        int res = count;
        for (int i = k; i < s.length(); i++) {
            if (a.contains(s.charAt(i))) {
                count++;
            }
            if (a.contains(s.charAt(i - k))) {
                count = count - 1;
            }
            res = Math.max(count, res);

        }
        return res;
    }
}
