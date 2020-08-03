/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author SRonan
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] board = new String[3][3];
        String plr = "O";
        /* Alternate way to create the Array using initialization
        String[][] board = {"*","*","*"},
                              {"*","*","*"},
                              {"*","*","*"}};
        */
        
        int rowNum, colNum;
        
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                board[r][c] ="*";
            }
        }
        
    printBoard(board);
    
    while(true)
    {
        if(plr == "X")
            plr ="O";
        else
            plr ="X";
        getMove(board, plr);    
        printBoard(board);
    }
}
    
    public static void printBoard(String[][] board)
    {
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }
    
    public static void getMove(String[][] board, String plr)
    {
        int rowNum, colNum;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the row: ");
        rowNum = kb.nextInt()-1;
        System.out.print("Enter the column: ");
        colNum = kb.nextInt()-1;
        
        while(board[rowNum][colNum] != "*")
        {
            System.out.println("Invalid move, please re-enter.");
            
            System.out.print("Enter the row: ");
            rowNum = kb.nextInt()-1;
            System.out.print("Enter the column: ");
            colNum = kb.nextInt()-1;
        }
        board[rowNum][colNum] = plr;
    }
}
