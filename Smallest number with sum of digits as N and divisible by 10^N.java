class Solution
{
    public String digitsNum(int N)
    {
       int c=0, n=N;
       while(N>9){
           c++;
           N-=9;
       }
       String str = "";
       str+=N;
       while(c-->0) str+='9';
       while(n-->0) str+='0';
       return str;
    }
}