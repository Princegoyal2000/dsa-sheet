import java.util.*;

public class BST_Trees {
	public static void print_at_k(BinaryTreeNode<Integer> root, int k)

	{
		if(k<0)
			return;
		if(k==0)
			System.out.print(root.data+" ");
		print_at_k(root.left,k-1);
		print_at_k(root.right,k-1);
		
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root)
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
    public static BinaryTreeNode<Integer> takeInputLevelWise()



	      {
	    	  Scanner S = new Scanner(System.in);
	    	  System.out.println("Enter the root data");
	    	  int rootData=S.nextInt();
	    	  if(rootData==-1)
	    	  {
	    		  return null;
	    	  }
	    	  Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
	    	  BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	    	  pendingNodes.add(root);
	    	  while(!pendingNodes.isEmpty())
	    	  {
	    		  BinaryTreeNode<Integer> front = pendingNodes.poll();
	    		  
	    		  System.out.println("Enter the left Child of : " +front.data);
	    		  int leftChild=S.nextInt();
	    		  
	    		  if(leftChild != -1)
	    		  {
	    			  BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
	    			  pendingNodes.add(child);
	    			  front.left=child;
	    		  } 
	    		  
	    		  System.out.println("Enter the right Child of : " +front.data);
	    		  int rightChild=S.nextInt();
	    		  
	    		  if(rightChild!=-1)
	    		  {
	    			  BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
	    			  pendingNodes.add(child);
	    			  front.right=child;
	    		  }
	    		  
	    	  }
	    	  return root;
	      }
    public static void print_between_keys(BinaryTreeNode<Integer> root,int key1,int key2)

        {
        	if(root==null) return ;
        	 int minimum = Math.min(key1, key2);
        	 int maximum= Math.max(key1, key2);
        	
        	 if(root.data>minimum)
        		 print_between_keys(root.left,key1,key2);
        	 
        	 if(root.data>=minimum && root.data<=maximum)
        		 System.out.print(root.data+" ");
        	 
        	 print_between_keys(root.right,key1,key2);
        	
        }
    public static BinaryTreeNode<Integer> search(BinaryTreeNode<Integer> root,int s)
	   {
        if(root==null || root.data==s) 
          return root;
        	
          if(root.data<s)
        	return   search(root.right,s);
          
          return search(root.left,s);
          
	   }
	public static boolean isBST(BinaryTreeNode<Integer> root)



//
//	   This Will have the TimmeComplexibility of O(n2)
//	   
	   {
		   if(root==null) 
			   return true;
		   int leftmax = maximum(root.left);
		   int rightmin = minimum(root.right);
		   if(root.data<leftmax || root.data>rightmin)
			   return false;
		   boolean isLeftBST = isBST(root.left);
		   boolean isRightBST = isBST(root.right);
	       if(isLeftBST && isRightBST)
	    	   return true;
	       else
	    	   return false;
	   }
	private static int minimum(BinaryTreeNode<Integer> root) {

		// TODO Auto-generated method stub
		   if(root==null)
			   return Integer.MAX_VALUE;
		   return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right)));
	}
	private static int maximum(BinaryTreeNode<Integer> root) {

		// TODO Auto-generated method stub
		   if(root==null)
			   return Integer.MIN_VALUE;
		   return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
		
	}
    public static boolean isBST3(BinaryTreeNode<Integer> root,int min , int max)
//  
//  This BSt is also having Time Complexibilty of O(n) but always remember the type 2 Methodology 
//  
  {
	  if(root==null)
		  return true;
	  if(root.data>max || root.data<min)
		  return false;
	  boolean isLeftOk = isBST3(root.left,min,root.data-1);
	  boolean isrightOk = isBST3(root.right,root.data,max);
	  return isLeftOk && isrightOk;
	  
  }
    public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root)

//     
	   
//	   This will have the Time Complexibilty of O(n)
	   
	   //
	   {
		   if(root==null)
		   {
			   Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
			   output.first=true;
			   output.second= new Pair<Integer,Integer>();
			   output.second.first=Integer.MAX_VALUE;
			   output.second.second=Integer.MIN_VALUE;
			   return output;   
		   }
		   Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBST2(root.left);
		   Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBST2(root.right);
		   int min= Math.min(root.data,Math.min(leftOutput.second.first, rightOutput.second.first));
		   int max=Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
		   boolean isBST=(root.data>leftOutput.second.second) && (root.data<rightOutput.second.first) && leftOutput.first && rightOutput.first;
		   
		   Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
		   output.first=isBST;
		   output.second= new Pair<Integer,Integer>();
		   output.second.first=min;
		   output.second.second=max;
		   return output; 		   
		   
		   
	   }
    public static BinaryTreeNode<Integer> take_sorted(int arr[],int start, int end){
    	if(start>end)
    		return null;
    	int mid=(start+end)/2;
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);

        	root.left=take_sorted(arr,start,mid-1);
        	root.right=take_sorted(arr,mid+1,end);    		


    	return root;
    	
    }
    public static ArrayList<Integer> rootToNode(BinaryTreeNode<Integer> root,int data)
 
    {
    	if(root==null)
    	return null;
    	if(root.data==data)
    	{
    		ArrayList<Integer> output = new ArrayList<>();
    		output.add(root.data);
    		return output;
    	}
    	if(root.data>data)
    	{
        	ArrayList<Integer> leftOutput= rootToNode(root.left,data);
        	if(leftOutput != null)
        	{
        		leftOutput.add(root.data);
        		return leftOutput;
        	}    		
    	}

        ArrayList<Integer> rightOutput= rootToNode(root.right,data);
	   if(rightOutput != null)
	   {
	      rightOutput.add(root.data);
		   return rightOutput;
    	}
	   else
	   {
		   return null;
	   }
    	
    }
    public static BinaryTreeNode<Integer> LCA1(BinaryTreeNode<Integer> root , int n1, int n2)
    {
  	  if(root==null)
  		  return null;

  	  
  	if(root.data > n1 && root.data > n2)
  	return  LCA1(root.left,n1,n2);
  	
  	
  	if(root.data <n1 && root.data < n2)
   	return  LCA1(root.right,n1,n2);
  	
  	
     return root;
     
    }
    public static void find_pairs(BinaryTreeNode<Integer> root, int target)

    {
  	  if(root == null) return;
  	  Stack<BinaryTreeNode<Integer>> stack1 = new Stack<BinaryTreeNode<Integer>>() ;
  	  Stack<BinaryTreeNode<Integer>> stack2 = new Stack<BinaryTreeNode<Integer>>() ;
  	  pushElements(root,stack1,true);
  	  pushElements(root,stack2,false);
  	  while(!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek().data<stack2.peek().data)
  	  {
  		  int x= stack1.peek().data;
  		  int y = stack2.peek().data;
  		  if(x+y == target)
  		  {
  			  System.out.println(x + " "+ y);
  		  }
  		  if(x+y < target)
  		  {
  			  BinaryTreeNode<Integer> temp = stack1.peek();
  			  stack1.pop();
  			  pushElements(temp.right,stack1,true);
  		  } 
  		  else
  		  {
  			  BinaryTreeNode<Integer> temp = stack2.peek();
  			  stack2.pop();
  			   pushElements(temp.left,stack2,false);
  		  }
  	  }
  	  
    }
    public static void pushElements(BinaryTreeNode<Integer> root , Stack<BinaryTreeNode<Integer>> stack, boolean direction)
    {
  	  
  	  if(direction)
  	  {
  		  while(root!=null)
  		  {
  			  stack.push(root);
  			  root=root.left;
  		  }
  	  }
  	  else
  	  {
  		  while(root!=null)
  		  {
  			  stack.push(root);
  			  root=root.right;
  		  }
  	  }
    }
    public static BinaryTreeNode<Integer> increaseData_by_Sum_of_bigger_nodes(BinaryTreeNode<Integer> root,int sum)
    {
           if(root==null)
        	   return null;
           increaseData_by_Sum_of_bigger_nodes(root.right,sum);
           int od= root.data;
           root.data=sum;
           sum +=od;
           increaseData_by_Sum_of_bigger_nodes(root.left,sum);
           return root;
           
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		   BinaryTreeNode<Integer> root = takeInputLevelWise();
//		   BinaryTreeNode<Integer> temp = search(root,5);
//        System.out.println(temp.data);
//        print_between_keys(root,6,2);
//		   System.out.println(isBST3(root));
//		int arr[]= {1,2,3,4,5,6,7};
//		BinaryTreeNode<Integer> temp = take_sorted(arr,0,arr.length-1);
//		System.out.println(rootToNode(root,7));
//		   root.hasData(4);
//		   print_at_k(root,2);
		 printLevelWise(  increaseData_by_Sum_of_bigger_nodes(root,0));
	}

}
