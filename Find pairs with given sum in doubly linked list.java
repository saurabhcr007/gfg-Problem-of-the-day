class Solution {
   public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
       
       if(head == null){
           return new ArrayList<>();
       }
       
       Node first = head;
       Node last = head;
       
       while(last.next != null){
           last = last.next;
       }
       
       ArrayList<ArrayList<Integer>> result = new ArrayList<>();
       
       while(first.data < last.data) {
           int sum = first.data + last.data;
           if(sum ==  target){
                result.add(new ArrayList<>(List.of(first.data, last.data)));
                first = first.next;
                last = last.prev;
           }
           else if(sum < target) {
               first = first.next;
           } else {
               last = last.prev;
           }
       }
       
       return result;
       
   }
}