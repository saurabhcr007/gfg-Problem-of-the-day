class Solution {

    int countDistinctIslands(int[][] grid) {
        int m=grid.length;
       int n=grid[0].length;
       int vis[][]=new int[m][n];
       Set<ArrayList<String>> hash_Set = new HashSet<>();
       int delRow[]={0,1,-1,0};
       int delCol[]={1,0,0,-1};
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(vis[i][j]==0 && grid[i][j]==1){
                   ArrayList<String> res=new ArrayList<String>();
                   dfs(vis,grid,i,j,res,delRow,delCol,i,j);
                   
                   hash_Set.add(res);
               }
           }
       }
       
       return hash_Set.size();
    }
     void dfs(int vis[][],int grid[][],int row,int col,ArrayList<String> res,int delRow[],int delCol[],int row0,int col0){

       vis[row][col]=1;
       res.add(Integer.toString(row-row0)+" "+Integer.toString(col-col0));
       int m=grid.length;
       int n=grid[0].length;
       for(int i=0;i<4;i++){
           int nrow=delRow[i]+row;
           int ncol=delCol[i]+col;
           if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
               dfs(vis,grid,nrow,ncol,res,delRow,delCol,row0,col0);
           }
       }
       
   }
}
