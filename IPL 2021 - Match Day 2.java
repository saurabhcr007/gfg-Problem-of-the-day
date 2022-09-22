class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        int max = Integer.MIN_VALUE;

        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = 0 ;

        for(; i < k; i++){

            q.add(arr[i]);

            max = Math.max(max,arr[i]);

        }

        list.add(max);

        while(i < n){

            int firstNum = q.remove();

            q.add(arr[i]);

            if(max == firstNum){

                max = -1;

                for(int j = 0; j < k ;j++){

                    int val = q.remove();

                    max = Math.max(max,val);

                    q.add(val);

                }

                list.add(max);    

            }else{

                max = Math.max(arr[i],max);

                list.add(max);

            }

            i++;

        }

        return list;
    }
}