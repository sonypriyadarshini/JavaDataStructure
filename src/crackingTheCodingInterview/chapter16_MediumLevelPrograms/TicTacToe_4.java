package crackingTheCodingInterview.chapter16_MediumLevelPrograms;
/*

https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/discuss/442823/Java-concise-100-100
https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/discuss/443365/Java-clever-readable-solution-with-detailed-comments
https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/discuss/443559/Java-0ms-beats-100-with-comments
 */

public class TicTacToe_4 {

    public static void main(String[] args) {
        int moves[][] = new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}};
        System.out.println(findTicTacWinner(moves));
    }

    static char findTicTacWinner(int moves[][]){

        char board[][]=new char[3][3];

        for(int i=0;i<moves.length;i++){
            board[moves[i][0]][moves[i][1]]=i%2==0?'A':'B';

        }

        for(int i=0;i<3;i++){
            if(board[i][0] == board[i][1] &&  board[i][1]==board[i][2])
                return board[i][0];
            else if(board[0][i] == board[1][i] && board[1][i]== board[2][i])
                return board[1][i];
        }

            if(board[1][1] == board[2][2] &&  board[2][2]== board[0][0])
                return  board[1][1];
            else if (board[0][2] == board[1][1] && board[1][1]== board[2][0])
                return board[1][1];

        return 'X';

    }

}
