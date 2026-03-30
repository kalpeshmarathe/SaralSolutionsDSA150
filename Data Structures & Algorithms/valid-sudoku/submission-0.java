class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows[] = new HashSet[9];
        HashSet<Character> cols[] = new HashSet[9];
        HashSet<Character> box[] = new HashSet[9];

        for(int i = 0 ; i < 9 ; i++)
        {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                if(board[i][j] == '.') continue;

                char num = board[i][j];
                int boxIdx = (i/3) * 3 + (j / 3) ;

                if(!rows[i].add(num) || !cols[j].add(num) || !box[boxIdx].add(num))
                {
                    return false;
                }

                

            }
           
        }
         return true;
    }
}
