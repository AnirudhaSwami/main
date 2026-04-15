

//Main class

import java.util.Scanner;

public class Game {
    public static void main(String [] args){
        String name;
        char sign;
        Scanner sc = new Scanner(System.in);
        Players Player1 = new Players();
        Players Player2 = new Players();


        System.out.println("Welcome to Tic Tack Toe");
        System.out.println("-------------------------------------");
        System.out.println("Enter Player1 Name for sign X : ");
        name = sc.nextLine();
        sign = 'X';
        Player1.playerRegistration(name, sign);

        System.out.println("Enter Player2 Name for sign O : ");
        name = sc.nextLine();
        sign = 'O';
        Player2.playerRegistration(name, sign);

       
        
        System.out.println("Let's play the game.");

        TicTackToe T = new TicTackToe();


        T.playGame(Player1.playerName, Player1.playerSign, Player2.playerName, Player2.playerSign);

        //T.gameArrayDisplay();
        char winner = T.Result(Player1.playerSign, Player2.playerSign);
        
        if(winner == 'N'){
            System.out.println("Match is tie!");
        }
        else if( winner == Player1.playerSign){
            System.out.println(Player1.playerName + " is won the match.");
        }
        else{
            System.out.println(Player2.playerName + " is won the match.");
        }
        
        sc.close();
    }
}

class Players{
    String playerName;
    char playerSign;

    void playerRegistration(String playerName, char playerSign){
        this.playerName = playerName;
        this.playerSign = playerSign;
    }
}

class TicTackToe{
    char[] gameArray = new char[9];

    public TicTackToe(){
        for (int i = 0; i < 9; i++) {
            gameArray[i] = (char) ('1' + i);
        }
    }

    void gameIntro(){
        System.out.println("    1   |   2   |   3   ");
        System.out.println("------------------------");
        System.out.println("    4   |   5   |   6   ");
        System.out.println("------------------------");
        System.out.println("    7   |   8   |   9   ");

        int pos=0;
        for(int row=0; row<5; row++){
            for(int col=row; col<3; col++){
                for(int space=0; space<4; space++){
                     System.out.print(" ");
                } 
                System.out.print(gameArray[pos]);
                pos++;


            }
        }
    }

    void playGame(String player1, char sign1, String player2, char sign2){        
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        for(int i=0; i<9; i++){
            if(i%2 == 0){
                
                System.out.print(player1 + " enter the position in chart where you want to place your sign: ");
                pos = sc.nextInt();
                
                if( (pos>=1 && pos<=9) && (gameArray[pos-1] != sign1 && gameArray[pos-1] != sign2)){
                    
                    gameArray[pos-1] = sign1;
                    gameArrayDisplay();
                }
                else{
                    System.out.println(player1 + ", enter the correct position in chart where you want to place your sign: ");
                    i--;
                }
            }
            else{
                System.out.print(player2 + " enter the position in chart where you want to place your sign: ");
                pos = sc.nextInt();
                if((pos>=1 && pos<=9) && (gameArray[pos-1] != sign1 && gameArray[pos-1] != sign2)){
                
                    gameArray[pos-1] = sign2;
                    gameArrayDisplay();
                }
                else{
                    System.out.println(player2 + ", enter the correct position in chart where you want to place your sign: ");
                    i--;
                }
            }
        }
        sc.close();
    }

    void gameArrayDisplay(){
        for (int i = 0; i < 9; i++) {
            System.out.print(gameArray[i] + " ");
            if ((i + 1) % 3 == 0) System.out.println(); 
        }
        System.out.println("");
    }
    
    char Result(char player1Sign, char player2Sign){
        //Check result if 1-2-3, 1-4-7, 3-6-9, 7-8-9, 1-5-9,3-5-7 are fill withh same logo

        int [][] WinInd = {
            {1,2,3},
            {1,4,7},
            {3,6,9},
            {7,8,9},
            {1,5,9},
            {3,5,7}    
        };
        
        //if(player1Sign == gameArray[0] && gameArray[0] == gameArray[1] && gameArray[1] == gameArray[2]){}

        for(int row=0; row<6; row++){
            if(player1Sign == gameArray[WinInd[row][0]-1] && gameArray[WinInd[row][0]-1] == gameArray[WinInd[row][1]-1] && gameArray[WinInd[row][1]-1] == gameArray[WinInd[row][2]-1]){
                return player1Sign;            
            }
            else if(player2Sign == gameArray[WinInd[row][0]-1] && gameArray[WinInd[row][0]-1] == gameArray[WinInd[row][1]-1] && gameArray[WinInd[row][1]-1] == gameArray[WinInd[row][2]-1]){
                return player2Sign;       
            }
           
        }
        
            return 'N'; 
    }
}
