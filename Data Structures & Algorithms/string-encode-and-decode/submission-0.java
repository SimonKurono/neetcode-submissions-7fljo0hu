class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for (String s : strs) {
            str+=s+" ";
        }

        return str;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        
        int last = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                list.add(str.substring(last, i));
                last = i+1;
            }
        }

        return list;
    }
}
