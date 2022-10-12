class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        Stack<Integer> st = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int num : a){
            while(!st.isEmpty() && st.peek() >= num)
                st.pop();
            
            if(st.isEmpty())    
                ans.add(-1);
            else    
                ans.add(st.peek());
            
            st.push(num);
        }
        return ans;
    }
}