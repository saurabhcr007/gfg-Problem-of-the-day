class Solution { 
    int minSubset(int[] Arr,int N) 
    {
        
        Arrays.sort(Arr);
        long sum =0 ;
        for(int  i : Arr)
        {
            sum = sum+i;
        }
        long c =0;
        int ct=0;
        for(int i= Arr.length-1; i>=0;i--)
        {
            c = c+Arr[i];
            ct++;
            if(c*2 > sum)
            {
                break;
            }
        }
        return ct;
        
    }
}