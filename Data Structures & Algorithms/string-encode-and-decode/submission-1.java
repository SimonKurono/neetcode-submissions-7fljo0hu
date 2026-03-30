class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        String str = "";
        List<Integer> spaces = new ArrayList<>();

        for (String s : strs) {
            str+=s;
            spaces.add(s.length());
        }

        String enc = "";

        for (int i : spaces) {
            enc+=String.valueOf(i);
        }

        return String.valueOf(enc.length()) + enc + str;
    }
//2,3,1,3
//42313wesay:yes
//wesay:yes
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        System.out.println(str);
        int len = Integer.valueOf(str.substring(0,1));

        List<Integer> breaks = new ArrayList<>();

        for (int i = 1; i < len+1; i++) {
            breaks.add(Integer.valueOf(str.substring(i,i+1)));
        }
        System.out.println((breaks));

        str = str.substring(len+1);
        System.out.println(str);
        int cur = 0;
        for (int i : breaks) {
            
            String s = str.substring(cur, cur+i);
            list.add(s);
            cur+=i;
            
            
        }

        return list;
    }
}
