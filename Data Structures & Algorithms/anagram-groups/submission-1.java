class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> angs = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();

        for (String s : strs) {
            int [] arr = new int [26];

            char[] cArr = s.toCharArray();

            for (char c : cArr) {
                arr[c-'a']++;
            }

            String key = Arrays.toString(arr);

            mp.putIfAbsent(key, new ArrayList<>());
            mp.get(key).add(s);
        }

        return new ArrayList<>(mp.values());
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int [] alp = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alp[s.charAt(i)-'a']++;
            alp[t.charAt(i)-'a']--;
        }

        for (int n : alp) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }
}
