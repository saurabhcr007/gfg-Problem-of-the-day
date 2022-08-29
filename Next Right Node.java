class Solution
{
	Node nextRight(Node root, int key)
   	{
		Queue<Node> q=new LinkedList<>();
 		q.add(root);
 		q.add(null);
 		while(!q.isEmpty())
		{
     			Node curr=q.poll();
     			if(curr==null)
			{
         			if(q.isEmpty()) return new Node(-1);
         			q.add(null);
         			continue;
     			}
     			if(curr.data==key)
			{ 
        			if(q.peek()==null) return new Node(-1);
        			return q.peek();
     			}
     			if(curr.left!=null) q.add(curr.left);
     			if(curr.right!=null) q.add(curr.right);
 		}
 		return new Node(-1);
   	}
}