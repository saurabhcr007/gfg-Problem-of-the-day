class Solution {
    public static int minChar(String str) {
   String s = str + "$" + new StringBuffer(str).reverse();
   return str.length() - computeLPSArray(s)[s.length()-1];
}
static int[] computeLPSArray(String pat) {
   int M = pat.length(), i = 0, j = 1;
   int[] lps = new int[M];
   while (j < M) {
       if(pat.charAt(i) == pat.charAt(j)){
          lps[j++] = ++i;
       } else if (i == 0) {
          lps[j++] = 0;
       } else {
          i = lps[--i];
       }
   }
   return lps;
}
}