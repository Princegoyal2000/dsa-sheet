
//
//
//IN SEARCHING , INSERTION , DELETION ALL ARE HAVING THE TIME COMPLEXIBILTY OF O(height) ~~ o(logN)
//
//
//




import java.util.LinkedList;
import java.util.Queue;

public class bstTrees {
 
	private static BinaryTreeNode<Integer> root;
	private  BinaryTreeNode<Integer> helperInsert(BinaryTreeNode<Integer> root, int data)
	{
        if(root==null)
        {
        	BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
        	return newNode;
        }
        if(root.data > data)
        {
        	root.left=helperInsert(root.left,data);
        }
        else
        {
        	root.right=helperInsert(root.right,data);
        }
       return root;
	}
	public  void insert(int data)
	{      
		 root=helperInsert(root,data);
	}
	public  boolean hasData(int data)
	{
		return hasDataHelper(data,root);
	}
	private  boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {

		// TODO Auto-generated method stub
		if(root==null)
			return false;
		if(root.data==data)
			return true;
		else if(root.data>data)
			return hasDataHelper(data,root.left);
		else
			return hasDataHelper(data,root.right);
		
	}
    public void deleteNode(int data)
    {
    	root = deleteNodeHelper(root,data);
    }
    private  BinaryTreeNode<Integer> deleteNodeHelper(BinaryTreeNode<Integer> root, int data)
    {
    	if(root==null)
    		return null;
    	if(root.data>data)
    	{
    		root.left = deleteNodeHelper(root.left,data);
    		return root;
    	}
    	else if(root.data < data)
    	{
    		root.right = deleteNodeHelper(root.right,data);
    		return root;
    	}
    	else
    	{
    		if(root.left == null && root.right == null)
    		{
    			return null;
    		}
    		else if(root.left ==null)
    		{
    			return root.right;
    		}
    		else if(root.right == null)
    		{
    			return root.left;
    		}
    		else
    		{
    			BinaryTreeNode<Integer> minNode = root.right;
    			while(minNode.left !=null)
    				minNode = minNode.left;
    			root.data = minNode.data;
    			root.right = deleteNodeHelper(root.right,minNode.data);
    			return root;
    		}
    	}
    }
    private void printLevelWise(BinaryTreeNode<Integer> root)



    {
  	  if(root == null)
  		  return ;
  	  Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
  	  pendingNodes.add(root);
  	  while(!pendingNodes.isEmpty())
  	  {
  		  BinaryTreeNode<Integer> front = pendingNodes.poll();
  		  System.out.print(front.data + " ->");
  		  if(front.left!=null)
  		  {
  			  System.out.print("L:" + front.left.data+ " ");
 
  			  pendingNodes.add(front.left);
  		  }
  		  if(front.right!=null)
  		  {
  			  System.out.print("R:" + front.right.data);
  			  		  
  			  pendingNodes.add(front.right);
  		  }
  		  System.out.println();
  	  }
  	  
    }
    public void printTree()
    {
    	printLevelWise(root);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bstTrees BST = new bstTrees();
		BST.insert(4);
		BST.insert(2);
		BST.insert(6);
		BST.insert(1);
		BST.insert(3);
		BST.insert(5);
		BST.insert(7);
		BST.printTree();
		System.out.println(BST.hasData(6));
		BST.deleteNode(4);
		BST.printTree();

	}

}
