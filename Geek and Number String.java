class Solution { 
    public int minLength(String s, int n) { 
    	String arr[] = {"12","21","34","43","56","65","78","87","09","90"};
        for(int i=0;i<=s.length()-2;i++){
            String x = s.substring(i,i+2);
            for(String y : arr){
                if(x.equals(y)){
                    s=s.replace(x,"");
                    i=-1;
                    break;
                }
            }
        }
        return s.length(); 
    }
}