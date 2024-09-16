package State.states;

import State.Game;

public abstract class State {
    private Game game;

    public State(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public abstract void action();

}
