class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<String, Long> s1 = new HashMap<>();
        Map<String, Long> s2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String st = s.substring(i,i+1);
            String ts = t.substring(i, i+1);
            s1.put(st, (long) s1.getOrDefault(st, 0) + 1);
            s2.put(ts, (long) s2.getOrDefault(ts, 0) + 1);
        }

        for (String key : s1.keySet()) {
            if (s1.get(key) != s2.get(key)) return false;
        }
        return true;
    }
}
