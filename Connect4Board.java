/**
 * Connect4 Board Information
 * Contained in package "connect4.game"
 * Author: Ian Sutton
 * FSUID: iss13
 * - Additional Information
 *
 *
 *
 */

package connect4.game


/**
 * Setting up the class for the Game Board
 * which will be used by other classes to 
 * initialize the board.
 *
 * According to the rules of Connect4, the board
 * will be a 7 by 7 grid. I accomplish this by creating
 * a two-dimensional array. 
 */
public class Connect4Board{
	// We first initialize an empty Connect4Board object - keeps things safe
	public static Connect4Board board = null;
	// Now we initialize a final (const) variable to keep track of the empty
	// positions on the board
	private static final int POSITION_EMPTY = 0;
	// Creation of final (const) variables to keep track of the vertical or 
	// horizontal positions on the connect4 board grid
	private static final int POSITIONS_VERTICAL = 7;
	private static final int POSITIONS_HORIZONTAL = 7;
	// Time to create our two-dimensional array for the board grid
	int[][] boardGrid; 

	// I'm using getInstance() method to create a singleton to return an 
	// instance of the game board
	public static Connect4Board getInstance(){
		// Check to see if there is a game board
		if(board != null){
			return board;
		}
		// Oops, doesn't exist, create one
		else{
			board = new Connect4Board();
			return board;
		}
	}//End getInstance singleton

	// Check to see if if the given POSITIONS_HORIZONTAL
	// is a valid index
	public boolean validPosHorz(int horzPosition){
		//Is it valid?
		if(this.POSITIONS_HORIZONTAL > horzPosition && horzPosition >= 0)
			return true;
		//No!
		else
			return false
	}//End validPosHorz

	// Check to see if if the given POSITIONS_VERTICAL
	// is a valid index
	public boolean validPosVert(int vertPosition){
		//Is it valid?
		if(this.POSITIONS_VERTICAL > vertPosition && vertPosition >= 0)
			return true;
		//No!
		else
			return false
	}//End validPosVert
	
}//End Connect4Board class
