class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        String str = "";
        List<Integer> spaces = new ArrayList<>();

        for (String s : strs) {
            str+=String.valueOf(s.length())+"#"+s;
        }


        return str;
    }
//2,3,1,3
//42313 2#wesay:yes
//wesay:yes
    public List<String> decode(String str) {
        System.out.println(str);
        List<String> list = new ArrayList<>();
        if (str.length() == 0) {
            return list;
        }

        String cur = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                cur+=str.substring(i, i+1);
                System.out.println(cur+" "+i);
            } else {
                
                int length = Integer.parseInt(cur);
                list.add(str.substring(i+1, i+1+length));
                cur = "";
                i = i+length;
            }
            
        }

        return list;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /**
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
            System.out.println(s);
            
            
        }

        return list; */
    }
}
