class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length <= 2) {
            return Integer.valueOf(tokens[0]);
        }
        Stack<Integer> nums = new Stack<>();

        for (String s : tokens) {
            if (s.equals("+")) {
                nums.push(nums.pop() + nums.pop());
            } else if (s.equals("-")) {
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a-b);
            } else if (s.equals("*")) {
                nums.push(nums.pop() * nums.pop());
            } else if (s.equals("/")) {
                int b = nums.pop();
                int a = nums.pop();
                nums.push(a/b);
            } else {
                nums.push(Integer.parseInt(s));
            }
        }

        return nums.pop();

    }
}
