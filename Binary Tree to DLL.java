class Solution
{
 
    Node bToDLL(Node root)
    {
	    if( root == null || (root.left == null && root.right == null)) return root;
        Node leftHead = bToDLL(root.left);
        Node rightHead = bToDLL(root.right);
    
        Node leftTail = leftHead;
        if(leftTail != null)
        while(leftTail.right != null) leftTail = leftTail.right;
        
        root.left = leftTail;
        root.right = rightHead;
        
        if(leftTail != null) leftTail.right = root;
        if(rightHead != null) rightHead.left = root;
        if(leftHead != null) return leftHead;
        
        return root;
    }
}