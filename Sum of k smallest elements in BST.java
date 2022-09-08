class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/

class Tree {
    int sum=0,c=0;
    int sum(Node root, int k) 
    { 
        if(root==null)
            return 0;
            
        int l=sum(root.left,k);
        c++;
        if(c>k)
            return sum;
        sum+=root.data;
        int r=sum(root.right,k);
        return sum;
    }  
}