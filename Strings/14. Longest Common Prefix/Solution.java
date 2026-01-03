class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder a = new StringBuilder();

        if (strs.length == 0) {
            return "";
        }
        int i = 0;
        while (i < strs[0].length()) {
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                a = a.append(strs[0].charAt(i));
                i++;
            }

            else {
                break;
            }
        }
        return a.toString();

    }
}
