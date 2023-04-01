import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class if_value_x_is_their {
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
	public static int nodesGreaterThanX(TreeNode<Integer> root, int x)
	{
	    if (root == null)
	        return 0;
	 
	    int count = 0;
	 
	    // If current root is greater
	    // than x increment count
	    if (root.data > x)
	        count++;
	 
	    // Recursively calling for every
	    // child of current root
	    for(int i=0;i<root.children.size();i++)
	    {
	        count += nodesGreaterThanX(root.children.get(i), x);
	    }
	 
	    // Return the count
	    return count;

}
	public static int count_leaf_nodes(TreeNode<Integer> root)
	{   
		int count = 0;
	 
	    if (root == null)
	        return 1;
	 
	   if(root.children.size()==0)
		   count++;
	    // If current root is greater
	    // than x increment coun
	 
	    // Recursively calling for every
	    // child of current root
	    for(int i=0;i<root.children.size();i++)
	    {
	        count += count_leaf_nodes(root.children.get(i));
	    }
	 
	    // Return the count
	    return count;
//		if(root.children.size()==0)
//			count++;
//		for(int i=0;i<root.children.size();i++)
//		{
//			count+=count_leaf_nodes(root.children.get(i),count);
//		}
//		return count;
	}
   public static boolean find(TreeNode<Integer> root, int x)
   { 
	   if(root==null)
	   return false;
	   for(int i=0;i<root.children.size();i++)
	   {
		   find(root.children.get(i),x);

	   }
	   if(root.data==x)
          {
		   return true;
          }
	   else {
		   return false;
	   }

   }
   public static boolean identical(TreeNode<Integer> root1,TreeNode<Integer> root2)
   {     
	   boolean  check=true;
	   
	   if(root1==null || root2==null)
      	    return false;
   
	   if(root1.data!=root2.data)
		   check=false;
	   
		   for(int i=0;i < root1.children.size() &&  i<root2.children.size();i++)
		   {     
			  
			  check =  identical(root1.children.get(i),root2.children.get(i));

		   }
		   
	      if(check)
	      	return true;
	     else
		    return false;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root1=takeInputLevelWise();
//    	TreeNode<Integer> root2=takeInputLevelWise();
		System.out.println(find(root1,5));
//		System.out.println(nodesGreaterThanX(root1,2));
//        System.out.println(identical(root1,root2));
//		System.out.println(count_leaf_nodes(root1));
	}

}
