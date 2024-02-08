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
        for(int i=0; i<=Constants.BOARD_SIZE; ++i){ //for row 
            int totalr= getBoardCell(i, 0) + getBoardCell(i, 1)+ getBoardCell(i, 2);
            int total =getBoardCell(0, 0) + getBoardCell(1, 1)+ getBoardCell(2, 2);
            int totalc= getBoardCell(0, i) + getBoardCell(1, i)+ getBoardCell(2, i);
            if (totalr == -3 || total == 3){
                return true; 
            }
            if (totalc == -3 || total == 3){
                return true; 
            }

            if (total == -3 || total == 3){
                return true; 
            }
            return false;

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

    public void resetBoard() {
        // Reset the board cells to BLANK
        for (int row = 0; row < Constants.BOARD_SIZE; row++) {
            for (int col = 0; col < Constants.BOARD_SIZE; col++) {
                setBoardCell(row, col, Constants.BLANK);
            }
        }
    }
}