import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> a = new HashMap<>();
        a.put('I', 1);
        a.put('V', 5);
        a.put('X', 10);
        a.put('L', 50);
        a.put('C', 100);
        a.put('D', 500);
        a.put('M', 1000);
        int i = s.length() - 2;
        int x = a.get(s.charAt(s.length() - 1));
        int prev = x;

        while (i >= 0) {
            if (a.get(s.charAt(i)) >= prev) {
                x += a.get(s.charAt(i));
                prev = a.get(s.charAt(i));
            }

            else {
                x -= a.get(s.charAt(i));
                prev = a.get(s.charAt(i));
            }

            i--;
        }
        return x;
    }
}
