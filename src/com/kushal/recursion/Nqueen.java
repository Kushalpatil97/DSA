package com.kushal.recursion;

public class Nqueen {

    static int placeQueen(boolean[][] board, int row)
    {
        if(row == board.length)
        {
            display(board);
            System.out.println();

            return 1;
        }

        int count = 0;
        for(int col = 0;col < board.length;col++)  // (0,0)
        {
            if(isSafe(board,row,col))
            {
                board[row][col] = true;
                count = count + placeQueen(board,row + 1);
                board[row][col] = false;

            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board, int row,int col)
    {
        // check on rows
        for(int i = 0 ; i < row ; i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }
        // check left diagonally
        int maxLength = Math.min(row,col);

        for(int i = 1;i<= maxLength;i++)
        {
            if(board[row -i][col -i])
            {
                return false;
            }
        }

        //check right  diagonally

        int maxright = Math.min(row, board.length - col -1);
        for(int i = 1; i <= maxright ; i++)
        {
            if(board[row -i][col + i])
            {
                return false;
            }
        }

        return true;
    }
    static void display(boolean[][] board)
    {
        for(boolean[] row : board)
        {
            for(boolean elment : row)
            {
                if(elment)
                {
                    System.out.print("Q");
                }
                else
                {
                    System.out.print("X");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int N = 4;
        boolean[][]  board = new boolean[N][N];
        placeQueen(board,0);
    }


}
