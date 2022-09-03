class Solution {
    public static int findMinTime(int n, int l, int[] arr) {
        int low = 1;
        int high = 1000000001;
        int ans =-1;
        Arrays.sort(arr);
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(isSolve(arr,mid,n)){
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1; 
            }
        }
        return ans;
    }

    public static boolean isSolve(int[] arr,int time,int n){
        int donutsC = 0;
        for(int i:arr){
            int tmp = i;
            int totalTime = i;
            while(totalTime <= time){
                donutsC++;
                if(donutsC >= n){
                    return true;
                }
                i = i + tmp;
                totalTime = totalTime + i;
            }
            if(donutsC >=n){
                return true;
           }
       }    
       return false;
    } 
}