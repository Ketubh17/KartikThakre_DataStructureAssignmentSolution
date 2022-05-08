package com.rightskewedtree;


import com.nodeclass.Node;
public class RightSkewedTree {

	private static Node node;
	static Node prevNode =null;
	static Node headNode = null;
	
	static void convertToRightSkewed(Node root, int num)
	{
		if(root ==null)
			return ;
		if(num > 0)
		{
			 convertToRightSkewed(root.right,num);
		}
		else
		{
			convertToRightSkewed(root.left,num);
		}
		
		 Node rightNode = root.right;
	     Node leftNode = root.left;
		if(headNode ==null)
		{
			headNode =root ;
			root.left =null;
			prevNode =root;
		}
		else
		{
			prevNode.right=root;
			root.left =null;
			prevNode= root;
		}
		if(num > 0)
		{
			 convertToRightSkewed(root.left,num);
		}
		else
		{
			convertToRightSkewed(root.right,num);
		}
		
	}
	
	
     static void traversedRightTree(Node node)
     {
    	 if (node ==null)
    		 return;
    	 System.out.println(node.root+ "");
    	 traversedRightTree(node.right);
     }
	
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RightSkewedTree tree = new RightSkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		

		int num =0;
		convertToRightSkewed(node,num);
		traversedRightTree(headNode);
	}

}
