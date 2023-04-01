
public class stackUsingArray {
  private int data[];
  private int top;
  public stackUsingArray() {
	  data=new int[10];
	  top=-1;
  }
  public stackUsingArray(int size)
  {
	  data=new int[size];
	  top=-1;
  }
  public boolean isEmpty()
  {

      return (top==-1);
  }
  public int size() 
 {

     return top+1;
 }
  public int top() throws StackEmptyException{ 
	  if(size()==0)
	  {
        StackEmptyException e = new StackEmptyException();
        throw e;
	  }
	  return data[top];
  }
  public void push(int elem) throws StackFullException
  {
	  if(size()==data.length)
	  {
//	        StackFullException e = new StackFullException();
//	        throw e;
		  doubleCapacity();
	  }
	  top++;
	  data[top]=elem;
  }
  private void doubleCapacity() {

   int temp[]=data;
   data=new int[2*temp.length];
   for(int i=0;i<=top;i++)
   {
	   data[i]=temp[i];
   }
	
}
public int pop() throws StackEmptyException

  {
	  if(size()==0)
	  {
		  StackEmptyException e = new StackEmptyException();
		  throw e;
	  }
	  int temp=data[top--];
	  return temp;
  }
  
}

