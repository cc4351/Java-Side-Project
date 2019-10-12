public class Board {


    private String[][] board;

    
    public Board() {

        board = new String[3][3];

    }


    public boolean put(String xo, int row, int col) {

        if(board[row][col] == null) {
            board[row][col] = xo;
            return true;
        }            

        return false;

    }


    public boolean hasSpace() {

        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[i].length; j++)
                if(board[i][j] == null)
                    return true;
        
        return false;

    }


    public String[][] getBoard() { return board; }


    public String toString() {

        String b = "";
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != null)
                    b += board[i][j];
                else
                    b += " ";
                
                if(j != board[i].length-1)
                    b += " | ";            
            }
            if(i != board.length-1)
                b += "\n--+---+--\n";
        }

        return b;

    }


}