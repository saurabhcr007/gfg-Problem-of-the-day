class Solution
{
    public static void convertToMaxHeapUtil(Node root)
    {
        if(root == null) return;
        Queue<Integer> al = new LinkedList<>();
        inorder(root, al);
        postOrderTraversal(root, al);
    }
    static void inorder(Node root, Queue<Integer> al) {
        if(root == null) return;
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
    static void postOrderTraversal(Node root, Queue<Integer> al) {
        if(root == null) return;
        postOrderTraversal(root.left, al);
        postOrderTraversal(root.right, al);
        root.data = al.remove();
    }
}