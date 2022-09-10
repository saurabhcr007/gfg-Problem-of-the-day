class Solution
{
    public int findOccurrence(char board[][],String word) {
    int ans = 0;
    for (int i=0; i<board.length; i++) {
        for (int j=0; j<board[0].length; j++) {
            ans += exist(board, i, j, word, 0);
        }
    }
    return ans;
}
int exist(char[][] board, int i, int j, String word,int ind) {
    int found = 0;
    if(i<board.length && i>=0 && j<board[0].length && j>=0 && word.charAt(ind)==board[i][j]){
        board[i][j] = ' ';
        if (ind == word.length()-1) {
            found = 1;
        } else {
           found += exist(board,i,j-1,word,ind+1);
           found += exist(board,i,j+1,word,ind+1);
           found += exist(board,i-1,j,word,ind+1);
           found += exist(board,i+1,j,word,ind+1);
        }
        board[i][j] = word.charAt(ind);
    }
    return found;
}
}