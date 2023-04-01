import java.util.Scanner;

public class TicTacToe {

	private Player player1,player2;
	private Board board;

	public static void main(String args[])
	{
		TicTacToe t = new TicTacToe();
		t.startGame();
	}
	public void startGame()
	{
		Scanner s = new Scanner(System.in);
		//Insert Players
		player1 = takeInputplayer(1);
		player2 = takeInputplayer(2);
		while(player1.getSymbol()==player2.getSymbol())
		{
		System.out.println("Symbol already exist !!!!!!  Pick another Symbol");
		char symbol = s.next().charAt(0);
		player2.setSymbol(symbol);
		}
		//Create Board
		board = new Board(player1.getSymbol(),player2.getSymbol());
		//Conduct the Game
		boolean player1Turn = true;
		int status = Board.INCOMPLETE;
		while(status==Board.INVALID || status == Board.INCOMPLETE)
		{
		
			if(player1Turn)
			{
			  System.out.println(" Player1-> "+ player1.getName() +"'s turns");
			  System.out.println("Enter x");
			  int x = s.nextInt();
			  System.out.println("Enter y");
			  int y = s.nextInt();
			  status=board.move(player1.getSymbol(),x,y); 
			  if(status != Board.INVALID)
			  {
				  player1Turn=false;
			  	  board.print();				  
			  }

			  else
			  	  {
			  		  System.out.println("INVALID MOVE !! TRY AGAIN");
			  	  }
			}
			else
			{
				  System.out.println(" Player2-> "+ player2.getName() +"'s turns");
				  System.out.println("Enter x");
				  int x = s.nextInt();
				  System.out.println("Enter y");
				  int y = s.nextInt();
				  status=board.move(player2.getSymbol(),x,y);
				  if(status != Board.INVALID)
				  {
					  player1Turn=true;
					  board.print();
				  }
			      else
				  	  {
				  		  System.out.println("INVALID MOVE !! TRY AGAIN");
				  	  }
			}
			
		}
		if(status == Board.PLAYER_1_WINS)
			System.out.println("Player1 - " + player1.getName() + " wins!!");
		
		else if(status == Board.PLAYER_2_WINS)
			System.out.println("Player2 - " + player2.getName() + " wins!!");
		
		else
			System.out.println("Draw !!");
	}
	private Player takeInputplayer(int num)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player" + num + "name : ");
		String name = s.nextLine();
		System.out.println("Enter Player" + num + "symbol : ");
		char symbol = s.next().charAt(0);
		Player p = new Player(name,symbol);
		return p;
	}
}
