class Solution{
    static List<String> pattern(int n){
        int sum = (n*(n+1));
        int n_ = n;
        int diff = n;
        int f = 1;
        List<String> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            
            for(int j = 0; j < i; j++)
                str.append("--");
            
            for(int j = 0; j < (n-i); j++) {
                str.append(f);
                str.append("*");
                f++;
            }
            int l = sum - diff + 1;
            for(int j = 0; j < (n-i); j++) {
                str.append(l);
                if(j != (n-i-1))
                    str.append("*");
                l++;
            }
            res.add(str.toString());
            diff = diff + (--n_);
        }
        
        return res;
    }
}