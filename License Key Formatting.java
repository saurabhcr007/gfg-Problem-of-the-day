class Solution{
    static String ReFormatString(String S, int K){
        S=S.replace("-","");
        S=S.toUpperCase();
       
        for(int i=S.length()-1;i>=0;i--){
            if(i-K+1>0)
             S=S.substring(0,i-K+1)+"-"+S.substring(i-K+1,S.length());
             i=i-K+1;
            }
        
        return S ;
    }
}