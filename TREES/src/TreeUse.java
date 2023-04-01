//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
import java.util.*;

public class TreeUse {
	
     public static TreeNode<Integer> takeInput(Scanner s)
     {
    	 int n;
    	 System.out.println("Enter next node data");
    	 n=s.nextInt();
    	 TreeNode<Integer> root= new TreeNode<Integer>(n);
    	 System.out.println("Enter number of Childrens for :"+ n);
    	 int childCount=s.nextInt();
    	 for(int i=0;i<childCount;i++)
    	 {
    		 TreeNode<Integer> child= takeInput(s);
    		 root.children.add(child);
    	 }
    	 return root;
     }
     public static TreeNode<Integer> takeInputLevelWise()
     {
    	 Scanner s = new Scanner(System.in);
    	 System.out.println("Enter the root data");
    	 int rootData = s.nextInt();
    	 Queue<TreeNode<Integer>> pendingNodes= new LinkedList<>();
    	 TreeNode<Integer> root =  new TreeNode<Integer>(rootData);
    	 pendingNodes.add(root);
    	 while(!pendingNodes.isEmpty())	
    	 {
    		
				TreeNode<Integer> frontNode = pendingNodes.poll();
				System.out.println("Enter num of children for :"+ frontNode.data);
				int numChildren=s.nextInt();
				for(int i=0;i<numChildren;i++)
				{
					System.out.println("Enter the "+(i+1)+"th child of "+ frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.add(childNode);
				}
			
    		 
    	 }
    	 return root;
    	 
     }
     public static void print_level_order_wise(TreeNode<Integer> root)
     {
    	 Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
    	 pendingNodes.add(root);
       	 while(!pendingNodes.isEmpty())
    	 {
    		 TreeNode<Integer>  frontNode= pendingNodes.poll();
    		System.out.print(frontNode.data+ " : ");
    		int numChild=frontNode.children.size();
//    		System.out.println(frontNode.data+" CHILDREN "+numChild);
    		for(int i=0;i<numChild;i++)
    		{
//    			TreeNode<Integer> childNode = new TreeNode<Integer>(frontNode.children.get(i).data);
    			System.out.print(frontNode.children.get(i).data+ " ,");
    			pendingNodes.add(frontNode.children.get(i));
    		}
    		System.out.println();
    	 }
     }
     public static void print(TreeNode<Integer> root)
     {
    	String S = root.data + " :";
    	for(int i=0;i<root.children.size();i++)
    	{
    		S=S+root.children.get(i).data+ ","; 
    	}
    	System.out.println(S);
    	for(int i=0;i<root.children.size();i++)
    	{
    		print(root.children.get(i)); 
    	}	
     }
     public static int numNodes(TreeNode<Integer> root)
     {
    	 if(root==null) return 0;
    	 int count=1;
    	 for(int i=0;i<root.children.size();i++)
    	 {
    		 count += numNodes(root.children.get(i));
    	 }
    	 return count;
     }
     public static int largest(TreeNode<Integer> root)
     {
    	 if(root == null) return Integer.MIN_VALUE;
    	 int ans=root.data;
    	 for(int i=0;i<root.children.size();i++)
    	 {
    		 int childLargest=largest(root.children.get(i));
    		 if(childLargest>ans)
    			 System.out.println(ans+"hiiie");
    			 ans=childLargest;
    	 }
    	 return ans;
     }
     public static int second_largest(TreeNode<Integer> root)
     {
    	 if(root == null) return Integer.MIN_VALUE;
    	 int ans=root.data;
    	 for(int i=0;i<root.children.size();i++)
    	 {
    		 int childLargest=second_largest(root.children.get(i));
    		 if(childLargest>ans && childLargest<largest(root.children.get(i)))
//    			 System.out.println(ans+"hiiie");
    			 ans=childLargest;
    	 }
    	 return ans;
     }
     public static void depth_of_tree(TreeNode<Integer> root,int k)
     {
    	 if(k<0) return ;
    	 if(k==0) 
    		 {
    		 System.out.println(root.data);
    		 }
    	 for(int i=0;i<root.children.size();i++)
    	 {
    		 depth_of_tree(root.children.get(i),k-1);
    	 }
     }
//     public static int count_leaf_nodes(TreeNode<Integer> root,int count) {
//            	 if(root==null)
//    		 return 1;
//    	 
//    	 for(int i=0;i<root.children.size();i++)
//    	 {
//    		count+= count_leaf_nodes(root.children.get(i),count);
//    	 }
//    	 return count;
//     }
//     
     public static void preorder_traversal(TreeNode<Integer> root)
     {    
    	 if(root==null)
    	 {
    		return;
    	 }
    	 System.out.print(root.data+" ");
    	 for(int i=0;i<root.children.size();i++)
    	 {
    		 preorder_traversal(root.children.get(i));
    	 }
     }
     public static void postorder_traversal(TreeNode<Integer> root)
     {   if(root==null)
     {
    	 return;
     }
    	 
    	 for(int i=0;i<root.children.size();i++)
    	 {
    		postorder_traversal(root.children.get(i));  		 
    		 
    	 }
    	 System.out.print(root.data+" ");
     }
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		TreeNode<Integer> root = takeInputLevelWise();
//		print(root);
	//	System.out.println(numNodes(root));
//		System.out.println(largest(root)+"rgrtt");
//		System.out.println(height(root));
	//	depth_of_tree(root,1);
//		int count=0;
//		System.out.println(count_leaf_nodes(root,count));
//		preorder_traversal(root);
//		System.out.println();
//		postorder_traversal(root);
	    System.out.print(second_largest(root));
//		print_level_order_wise(root);
	
	}

}
