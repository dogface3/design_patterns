package State.states;
import State.Game;

public class MasterState extends State{
    public MasterState(Game game) {
        super(game);
    }

    @Override
    public void action() {
        System.out.println("you completed the game");
        System.out.println("starting new game");
        getGame().resetAll();
        getGame().setState(new NoviceState(this.getGame()));
    }
}
