class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int res=a[0];
        int cur=a[0];
        for(int i=1;i<size;i++){
            cur = Math.min(a[i],a[i]+cur);
            res=Math.min(res,cur);
        }
        return res;
    }
}