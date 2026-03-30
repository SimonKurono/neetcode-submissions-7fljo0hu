class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, List<int[]>> mp = new HashMap<>();

        for (int m = 0; m < board.length; m++) {
            for (int n = 0; n < board[0].length; n++) {
                if (board[m][n] != '.') {
                    mp.put(board[m][n], mp.getOrDefault(board[m][n], new ArrayList<int[]>()));
                    mp.get(board[m][n]).add(new int [] {m, n});
                }
            }
        }
        for (char key : mp.keySet()) {
            List<Integer> rows = new ArrayList<>();
            List<Integer> cols = new ArrayList<>();
            List<Integer> boxes = new ArrayList<>();

            List<int[]> p = mp.get(key);
            for (int [] n : p) {
                if (rows.contains(n[0])) {
                    return false;
                }
                rows.add(n[0]);

                if (cols.contains(n[1])) {
                    return false;
                }
                cols.add(n[1]);
                int box = (n[0]/3)*3 + (n[1]/3);
                if (boxes.contains(box)) {
                    return false;
                }
                boxes.add(box);
            }            
        }




        return true;
    }
}
