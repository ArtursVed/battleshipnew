package lv.tsi.battleship.model;

import org.w3c.dom.html.HTMLFieldSetElement;

import java.util.Map;

public class User {
    private String name;
    private Field myField = new Field();
    private Field enemyField = new Field();
    private boolean ready = false;
    private boolean winner = false;


    public Field getMyField() {
        return myField;
    }


    public Field getEnemyField() {
        return enemyField;
    }

    public boolean isReady() {
        return ready;
    }

    public boolean isWinner() {
        return winner;
    }

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
