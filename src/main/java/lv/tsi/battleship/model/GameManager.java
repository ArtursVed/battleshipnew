package lv.tsi.battleship.model;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GameManager {
    private Game incompleteGame;

    public Game setupGame(User user){
        if (incompleteGame == null) {
            incompleteGame = new Game();
            incompleteGame.setPlayer1(user);
            return incompleteGame;
        } else {
            Game tmp = incompleteGame;
            tmp.setPlayer2(user);
            incompleteGame = null; // sbrasivaem dlja 2 , 3 i utt polzovatelja
            return tmp;
        }

    }


}
