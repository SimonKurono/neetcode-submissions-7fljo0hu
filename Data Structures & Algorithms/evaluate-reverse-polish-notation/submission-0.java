class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length <= 2) {
            return Integer.valueOf(tokens[0]);
        }
        Stack<Integer> nums = new Stack<>();
        Stack<String> ops = new Stack<>();

        for (int i = tokens.length-1; i >= 0; i--) {
            if (isOp(tokens[i].charAt(0))) {
                ops.push(tokens[i]);
            } else {
                nums.push(Integer.valueOf(tokens[i]));
            }
        }

        

        while (!ops.isEmpty()) {
            int a = nums.pop();
            int b = nums.pop();
            String op = ops.pop();

            int res = operation(a,b,op);

            nums.push(res);
        }

        return nums.pop();

        
    }

    private int operation (int a, int b, String op) {
        switch (op) {
            case "+":
                return a+b; 
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
        }
        return -1;

    }

    private boolean isOp(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
