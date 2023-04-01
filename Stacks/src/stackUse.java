
public class stackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		stackUsingArray stack = new stackUsingArray();
		for(int i=1;i<=5;i++)
		{
			stack.push(i);
		}
		while(!stack.isEmpty())
		{
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				
			}
		}

	}

}
