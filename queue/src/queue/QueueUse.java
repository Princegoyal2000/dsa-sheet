package queue;

public class QueueUse {

	public static void main(String[] args) {
		//QueueUsingArray queue= new QueueUsingArray(3);
		QueueUsingLinkList<Integer> queue= new QueueUsingLinkList<>();
		for(int i=0;i<10;i++)
		{
          queue.enque(i);
		}
		for(int i =0;i<9;i++)
		{
			try {
				System.out.println(queue.deque());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
