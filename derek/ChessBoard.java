
public class ChessBoard {

	
	private Object[][] board=new Object[8][8];
	private int row,col;
	public ChessBoard()
	{
		board[0][0]="Rook";
		board[0][7]="Rook";
		board[0][1]="Knight";
		board[0][6]="Knight";
		board[0][2]="Bishop";
		board[0][5]="Bishop";
		board[0][3]="Queen";
		board[0][4]="King";
		for(int i=0;i<8;i++)
		{
			board[1][i]="Pawn";
		}
		for(row=2;row<8;row++)
		{
			for(col=0;col<8;col++)
			{
				board[row][col]="A";
			}
		}
		board[7][0]="Rook";
		board[7][7]="Rook";
		board[7][1]="Knight";
		board[7][6]="Knight";
		board[7][2]="Bishop";
		board[7][5]="Bishop";
		board[7][4]="Queen";
		board[7][3]="King";
		for(int i=0;i<8;i++)
		{
			board[6][i]="Pawn";
		}
	}
	public String toString()
	{
		String s;
		s="";
		for(int row=0;row<8;row++)
		{
			s+="\n";
			for(int col=0;col<8;col++)
			{
				s+=board[row][col];
				s+=" ";
			}
		}
	return s;	
	}
}