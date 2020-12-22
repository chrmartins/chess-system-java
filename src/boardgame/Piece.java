package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.setBoard(board);
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	

}
