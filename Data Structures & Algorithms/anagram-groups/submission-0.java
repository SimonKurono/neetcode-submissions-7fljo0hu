class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> angs = new ArrayList<>();

        List<String> s1 = new ArrayList<>();
        s1.add(strs[0]);
        angs.add(s1);

        for (int i = 1; i < strs.length; i++) {
            boolean flag = true;
            for (int j = 0; j < angs.size(); j++) {
                if (isAnagram(angs.get(j).get(0), strs[i])) {
                    angs.get(j).add(strs[i]);
                    flag = false;
                }   
            }
            if (flag) {
                List<String> s2 = new ArrayList<>();
                s2.add(strs[i]);
                angs.add(s2);
            }
        }

        return angs;
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
