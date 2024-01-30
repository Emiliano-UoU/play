package tictactoe;

public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    public int getGmeSate(){
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
        for(i=0; i=<whoseMove ++i; ){
            if (board [i][o]== whoseMove || board[i][1] == whoseMove || board[i][2]== whoseMove){
                return true; 
            }
        }

        public boolean isTie() {

            ui.printTieGame(state);
            state.setGameState(Constants.GAME_OVER);

            if (gameState == Constants.GAME_OVER) {
                if (ui.startNewGame()) {

                    state.setGameState(Constants.STANDBY);
                } else {
                    state.setGameState(Constants.QUIT_PROGRAM);
                }
            }
        }
    }

