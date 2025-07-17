class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        s = new String(s1);
        t = new String(s2);

        return s.equals(t);
    }
}