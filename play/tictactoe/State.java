package tictactoe;

public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    public int getGameState(){
        return this.gameState;
    }

    public void setGameState (int gameState){
        this.gameState = gameState;
    }

    public int getWhoseMove() {
        return this.whoseMove;
    }

    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }

    public String getXName() {
        return this.xName;
    }

    public void setXName(String xName) {
        this.xName = xName;
    }

    public String getOName() {
        return this.oName;
    }

    public void setOName(String oName) {
        this.oName = oName;
    }

    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }

    public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }

    public boolean isWinner() {
        for(int i=0; i<=Constants.BOARD_SIZE; ++i){
            if (board [i][0]== whoseMove && board[i][1] == whoseMove && board[i][2]== whoseMove){
                return true; 
            }
           
        }
        return false;
        }
        

    public boolean isTie() {
      for(int r = 0 ; r<Constants.BOARD_SIZE; ++r) {
          for(int c=0; c<Constants.BOARD_SIZE; ++c){
              if (getBoardCell(r,c) == Constants.BLANK){
                  return false;
              }
          }
      }
      return true;
      }
      
}

