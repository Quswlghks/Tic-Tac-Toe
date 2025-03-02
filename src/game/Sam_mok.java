package game;

import game.type_of_pannel.pieces;

public class Sam_mok {

    public static void main(String[] args) {
        
        Pannels Board = new Pannels(3,3); // make new board to play
        User player1 = new User(pieces.O); // make user 1,2
        User player2 = new User(pieces.X);
        
        Game_Algorithm GA = new Game_Algorithm(Board,player1,player2); // execute game engine with 3 variables.
        
        Gui_play_of_game GamePlay = new Gui_play_of_game(GA); // execute the GUI of this game
     
    }
    
}
