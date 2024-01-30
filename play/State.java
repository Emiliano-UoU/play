public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

    public boolean isWinner() {
        if{
            
            
           
            
            
            
            
            
        }
    }

    public boolean isTie() {
      for(i=0, i = Constants.BOARD_SIZE*contants.BOARD_SIZE; ++i;){
        
          
      }
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
