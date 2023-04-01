
import java.util.*;

public class BinaryTreeUse {
     
	  public static BinaryTreeNode<Integer> takeInput(Scanner s)

      {
    	int rootData;
    	System.out.println("Enter the root data");
    	rootData=s.nextInt();
    	 if(rootData==-1)
           return null;
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    	root.left=takeInput(s);
    	root.right=takeInput(s);
    	return root;
      }
      public static void printNode(BinaryTreeNode<Integer> root)

      {
    	  if(root==null) return;
    	  
    	  String tobePrinted= root.data+ " ->";
    	  
    	  if(root.left!=null)
    		  tobePrinted += "L:" + root.left.data+" ,";
    	  
    	  if(root.right!=null)
    		  tobePrinted += "R:" + root.right.data+" ,";
    	  System.out.println(tobePrinted);
    	  printNode(root.left);
    	  printNode(root.right);
    	  
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
      public static int count(BinaryTreeNode<Integer> root)


      {
    	  	if(root==null)
    	  		return 0;
    	  	int ans=1;
    	  	ans += count(root.left);
    	  	ans += count(root.right);
    	  	return ans;

    	  	
      }
      public static int Diameter(BinaryTreeNode<Integer> root)

      {
    	  if (root==null) return 0;
    	  int option1=height(root.left)+height(root.right);
    	  int option2=Diameter(root.left);
    	  int option3=Diameter(root.right);
    	  return 1+Math.max(option1, Math.max(option2, option3));
      }
      public static int height(BinaryTreeNode<Integer> root)


      {
		if(root==null) return 0;
		int lh=height(root.left);
	    int rh=height(root.right);
		return 1+Math.max(lh, rh);
    	  
      }
      public static Pair<Integer,Integer> heightDiameter(BinaryTreeNode<Integer> root) {
    	  if(root == null)
    	  {
    		  Pair<Integer,Integer> output = new Pair<>();
    		  output.first=0;
    		  output.second=0;
    		  return output;
    	  }
    	  Pair<Integer,Integer> lo = heightDiameter(root.left);
    	  Pair<Integer,Integer> ro = heightDiameter(root.right);
    	  int height = 1+Math.max(lo.first, ro.first);
    	  int option1 = lo.first+ ro.first;
    	  int option2 = lo.second;
    	  int option3 = ro.second;
    	  int diameter= Math.max(option1, Math.max(option2, option3));
		  Pair<Integer,Integer> output = new Pair<>();
		  output.first=height;
		  output.second=diameter;
		  return output;
      }
      public static Pair<Integer,Integer> heightDiameter1(BinaryTreeNode<Integer> root){
    	  if(root==null)
    	  {
    		  Pair<Integer,Integer> output = new Pair<>();
    		  output.first=0;
    		  output.second=0;
    		  return output;
    	  }
		  Pair<Integer,Integer> lo = heightDiameter1(root.left);
		  Pair<Integer,Integer> ro = heightDiameter1(root.left);
		  int height = 1+ Math.max(lo.first, ro.first);
		  int option1 = lo.first+ro.first;
		  int option2 = lo.second;
		  int option3 = ro.second;
		  int diameter=Math.max(option1, Math.max(option2, option3));
		  Pair<Integer,Integer> output = new Pair<>();
		  output.first=height;
		  output.second=diameter;
		  return output;
      }
      public static void inorder(BinaryTreeNode<Integer> root)

      {
    	  if(root==null)
    	  {
    		  return ;
    	  }
    	  inorder(root.left);
    	  System.out.print(root.data+" ");
    	  inorder(root.right);
    	  
      }
      public static void preorder(BinaryTreeNode<Integer> root)

      {
    	  if(root==null)
    	  {
    		  return ;
    	  }
		  System.out.print(root.data+" ");
    	  preorder(root.left);
    	  preorder(root.right);

     	 
    	  
      }
      public static void postorder(BinaryTreeNode<Integer> root)

      {
    	  if(root==null)
    	  {
    		  return ;
    	  }
    	  System.out.print(root.data+" ");
    	  postorder(root.left);
    	  postorder(root.right);
    	  
     	 
    	  
      }
      public static BinaryTreeNode<Integer> BuildTreeHelper(int in[],int pre[], int inS,int preS,int inE,int preE)
      {
    	  if(inS > inE)
    		  return null;
    	  
	      int rootData = pre[preS];
	      	
	      BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	      int rootIndex=-1;
	      
	      for(int i=inS;i<=inE;i++)
	      {
	    	  if(rootData==in[i])
	    	  {
              rootIndex=i;
	    	  break; 
	    	  } 
	      }
	      if(rootIndex == -1)
	    	  return null;
	      int leftinS = inS;
	      int leftinE = rootIndex-1;
	      int leftpreS = preS+1;
	      int leftpreE = leftinE-leftinS + leftpreS;
	      int rightinS = rootIndex+1;
	      int rightinE = inE;
	      int rightpreS = leftpreE+1;
	      int rightpreE = preE;
	      root.left = BuildTreeHelper ( in , pre , leftinS , leftpreS , leftinE , leftpreE );
	      root.right = BuildTreeHelper( in , pre , rightinS , rightpreS , rightinE , rightpreE );
    	  return root;
      }
      public static BinaryTreeNode<Integer> BuildTreeHelper1(int in[],int pos[],int inS,int posS,int inE,int posE)
      { 
    	  if(inS > inE)
    	  return null;
    	  
          int rootData=pos[posE];
          
          BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
      
      int rootIndex=-1;
      
      for(int i=inS;i<=inE;i++)
      {
    	  if(rootData==in[i])
    	  {
    		  rootIndex=i;
    		  break;
    	  }
      }
      
      if(rootIndex==-1)
    	  return null;
      
      int leftinS=inS;
      int leftinE=rootIndex-1;
      int rightinS=rootIndex+1;
      int rightinE = inE;
      int leftposS=posS;
      int leftposE=leftinE-leftinS;
      int rightposS=leftposE+1;
      int rightposE=posE-1;
      root.left=BuildTreeHelper1(in,pos,leftinS,leftposS,leftinE,leftposE);
      root.right=BuildTreeHelper1(in,pos,rightinS,rightposS,rightinE,rightposE);
      
		return root;
    	  
      }
      public static  BinaryTreeNode<Integer> BuildTree(int in[],int pos[])
    {    
    	  return BuildTreeHelper1(in,pos,0,0,in.length-1,pos.length-1);
      }
      public static boolean findX(BinaryTreeNode<Integer> root,int X)


      {
    	  if(root==null)
    		  return false;
          if(root.data==X)
          	return true;      	  
    	boolean x=  findX(root.left,X); 
    	if(x) return true;
    	boolean y=  findX(root.right,X);
       if(y) return true;
            	return false;
    	  
      }
      public static  BinaryTreeNode<Integer> Mirror_of_tree(BinaryTreeNode<Integer> root)

      {

         if(root==null)
        	 return null;
         Mirror_of_tree(root.left);
         Mirror_of_tree(root.right);
         BinaryTreeNode<Integer> temp;
         temp = root.left;
         root.left=root.right;
         root.right=temp;
        return root;
         
      }
      public static int Sum_of_nodes(BinaryTreeNode<Integer> root)

      {
          int sum;
      	 if(root==null)
    		 return 0;
    	 sum = root.data;
    	sum += Sum_of_nodes(root.left);
    	sum += Sum_of_nodes(root.right);
    	 return sum;
    	 
       }
      public static int helperHeight(BinaryTreeNode<Integer> root)
      {
    	  if(root==null)
    		  return 0;
    	  int lh = helperHeight(root.left);
    	  int rh = helperHeight(root.right);
//    	  if(lh==-1 || rh==-1)
//    		  return -1;
    	  if(Math.abs(lh-rh)>1)
    		  return -1;
    	  return Math.max(lh, rh)+1;
      }
      public static boolean balanced_or_not_height(BinaryTreeNode<Integer> root)
      {
        return helperHeight(root) != -1;  
      }
      public static void print_without_siblings_nodes(BinaryTreeNode<Integer> root)

      {
    	  if(root==null)
    	  {
    		  return;
    	  }
    	  if(root.left==null && root.right!=null)
    	  {
    		  System.out.println(root.right.data);
    	  }
    	  if(root.left!=null && root.right==null)
    	  {
    		  System.out.println(root.left.data);
    	  }
    	  print_without_siblings_nodes(root.left);
    	  print_without_siblings_nodes(root.right);
      }
      public static BinaryTreeNode<Integer> remove_leaf_nodes(BinaryTreeNode<Integer> root)
      { 
    	  if(root==null) return null;
          if(root.left==null && root.right==null)
        	  return null;
          root.left= remove_leaf_nodes(root.left);
          root.right = remove_leaf_nodes(root.right);
          return root;
   
    	  
      }
      public static void spiral(BinaryTreeNode<Integer> root)
      {     
//    	  if(root==null)
//    	  {
//    		  return;
//    	  }
    	  Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
    	  Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();
    	  stack1.push(root);
    	  while(!stack1.isEmpty() || !stack2.isEmpty())
    	  {   
    		  BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>();
    		  while(!stack1.isEmpty())
    		  {
    			temp=stack1.pop();
    			System.out.print(temp.data+" ");
    			if(temp.left != null)
    			{																																									
    				stack2.push(temp.left);
    			}
    			if(temp.right != null)
    			{
    				stack2.push(temp.right);
    			}
    		  }
    		  while(!stack2.isEmpty())
    		  {
    			temp=stack2.pop();
    			System.out.print(temp.data+" ");
    			if(temp.right != null)
    			{
    				stack1.push(temp.right);
    			}
    			if(temp.left != null)
    			{
    				stack1.push(temp.left);
    			}
    		  }
    	  }
    	  
      }
      public static BinaryTreeNode<Integer> Insert_Copy_Node(BinaryTreeNode<Integer> root) 	
      {
    	  if(root==null)
    	  {
    		  return null;
    	  }
    	  Insert_Copy_Node(root.left);
    	  Insert_Copy_Node(root.right);
    	  BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<Integer>(root.data);
    	  BinaryTreeNode<Integer> temp=root.left;
    	  root.left=duplicate;
    	  duplicate.left=temp;
    	  return root;

      }
      public static ArrayList<Integer> rootToNode(BinaryTreeNode<Integer> root , int data) 

      {
    	  if(root==null)
    	  return null;
    	  if(root.data ==  data)
    	  {
    		  ArrayList<Integer> output = new ArrayList<Integer>();
    		  output.add(root.data);
    		  return output;
    	  }
    	  ArrayList<Integer> leftOutput = rootToNode(root.left,data);
    	  if(leftOutput != null)
    	  {
    		  leftOutput.add(root.data);
    		  return leftOutput;
    	  }
    	  ArrayList<Integer> rightOutput = rootToNode(root.right,data);
    	  if(rightOutput != null)
    	  {
    		  rightOutput.add(root.data);
    		  return rightOutput;
    	  }
    	  else
    		  return null;
    	  
      }
      public static BinaryTreeNode<Integer> LCA1(BinaryTreeNode<Integer> root , int n1, int n2)
      {
    	  if(root==null)
    		  return null;
    	  if(root.data==n1 || root.data==n2)
    		  return root;
    	  BinaryTreeNode<Integer> left = LCA1(root.left,n1,n2);
    	  BinaryTreeNode<Integer> right = LCA1(root.right,n1,n2);
    	  if(left!=null && right!=null)
    		  return root;
    	  if(right==null)
    		  return left;
    	  else
    		  return right;
      }
      public static int LCA(BinaryTreeNode<Integer> root , int n1, int n2)
      {
    	  ArrayList<Integer> path1 = rootToNode(root,n1);
    	  ArrayList<Integer> path2 = rootToNode(root,n2);
    	  if(path1.size()==0)
    		  return n2;
    	  if(path2.size()==0)
    		  return n1;
    	  int size1= path1.size();
    	  int size2 = path2.size();

//    	  System.out.println(size1);
//    	  System.out.println(size2);
    	  
    	  while(size1>0 && size2>0)
    	  {
    		  if(path1.get(size1-1)!=path2.get(size2-1))
    		  {

   			  break;
    		  }
    		  System.out.println(size1--);
    		  System.out.println(size2--);
    	  }
   	  return path1.get(size1);
      }
      public static void printPaths(BinaryTreeNode<Integer> root, int sum)
			{
				ArrayList<Integer> path = new ArrayList<Integer>();
				print_path_till_node_sum(root,0,sum,path);
			}
      private static void print_path_till_node_sum(BinaryTreeNode<Integer> root, int curr, int sum,	ArrayList<Integer> path) 
			{
				if(root==null)
					return;
				curr=curr+root.data;
				path.add(root.data);
				
				if(curr==sum) {
					for(int i=0;i<path.size();i++)
					{
						System.out.print(path.get(i)+" ");
					}
					System.out.println();
				}
				if(root.left!=null)
				{
					print_path_till_node_sum(root.left,curr,sum,path);
				}
				if(root.right!=null)
				{
					print_path_till_node_sum(root.right,curr,sum,path);	
				}
				path.remove(path.size()-1);
			}
	  public static void main(String[] args) {


					BinaryTreeNode<Integer> root = takeInputLevelWise();
//					System.out.println(height(root));
					       printLevelWise(root);
//					      System.out.println(count(root));
						System.out.println(Diameter(root));
//					      System.out.println("Diameter"  + heightDiameter1(root).second);
//					       System.out.println("height"  + heightDiameter1(root).first);
//					       inorder(root);
//					       System.out.println();
//					       preorder(root);
//					System.out.println(balanced_or_not_height(root));
					//       System.out.println();
					//       postorder(root);
					//		int in[]= {3,2,9,7,8,1,5,9};
					//	//	int pre[]= {1,2,3,9,7,8,5,9};
					//		int pos[]= {3,8,7,9,2,9,5,1};
					//		BinaryTreeNode<Integer> root = BuildTree(in,pos);
							
					//       print_without_siblings_nodes(root);
//					       printLevelWise(Insert_Copy_Node(root));
					//BinaryTreeNode<Integer> temp = LCA1(root,1,6);
					//System.out.println(temp.data);
					//find_pairs(root,8);
				//	printPaths(root,11);
//					       System.out.println(rootToNode(root));
					       

		
				
				
				
	}

}
