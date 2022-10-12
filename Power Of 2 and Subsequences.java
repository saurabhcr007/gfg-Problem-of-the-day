class Solution{
    static int mod = (int)1e9 + 7;
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        long c = 0;
        for(long n:A){
            if(isPower2(n)){
                c = (c + (c+1)%mod)%mod;   // c += c + 1;
            }
        }
        return c;
    }
    static boolean isPower2(long n){
        return (n&(n-1))==0;
    }
}