class Solution {
    public static int minimumSwaps(int[] c, int[] v,int n,int k,int b,int t) {
        int ans=0, count=0;
        for(int i=n-1;i>=0;i--){
            int val = c[i]+v[i]*t;
            if(val<b){
                count++;
            }else{
                k--;
                ans+=count;
                if(k==0) return ans;
            }
        }
        return -1;
    }
}