

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

        T.gameArrayDisplay();
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
                if(gameArray[pos-1] != sign1 && gameArray[pos-1] != sign2){
                    
                    gameArray[pos-1] = sign1;
                }
                else{
                    System.out.println(player1 + ", enter the correct position in chart where you want to place your sign: ");
                    i--;
                }
            }
            else{
                System.out.print(player2 + " enter the position in chart where you want to place your sign: ");
                pos = sc.nextInt();
                if(gameArray[pos-1] != sign1 && gameArray[pos-1] != sign2){
                
                    gameArray[pos-1] = sign2;
                }
                else{
                    System.out.println(player2 + ", enter the correct position in chart where you want to place your sign: ");
                    i--;
                }
            }
        }
    }

    void gameArrayDisplay(){
        for (int i = 0; i < 9; i++) {
    System.out.print(gameArray[i] + " ");
    if ((i + 1) % 3 == 0) System.out.println(); // New line every 3 characters
}

    }
        
}
