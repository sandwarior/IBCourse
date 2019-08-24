/*Valid Sudoku
Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx 
The input corresponding to the above configuration :
["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
A partially filled sudoku which is valid.
 Return 0 / 1 ( 0 for false, 1 for true ) for this problem.
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        int[][] row = new int[10][10];
        int[][] col = new int[10][10];
        int[][] block = new int[10][10];
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int x = A.get(i).charAt(j)-48;
               // System.out.println(i+" "+j+" "+x);
                if(x>=1 && x<=9){
               // System.out.println(row[i][x]+" "+col[j][x]+" "+block[((i/3)*3)+((j/3))][x]);
                if(row[i][x]==1)
                return 0;
                else
                row[i][x]=1;
                if(col[j][x]==1)
                return 0;
                col[j][x]=1;
                if(block[((i/3)*3)+((j/3))][x]==1)
                return 0;
                else
                block[((i/3)*3)+((j/3))][x]=1;
               // System.out.println(row[i][x]+" "+col[j][x]+" "+block[((i/3)*3)+((j/3))][x]);
                }
            }
        }
        return 1;
    }
}
