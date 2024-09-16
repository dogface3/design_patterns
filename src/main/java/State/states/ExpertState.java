package State.states;
import State.Game;

public class ExpertState extends State {
    public ExpertState(Game game) {
        super(game);
    }

    @Override
    public void action() {
        System.out.println("name:" + getGame().getName());
        System.out.println("hp:" + getGame().getHp());
        System.out.println("level:" + getGame().getLevel());
        System.out.println("xp:" + getGame().getXp());

        String[] options = {"Train", "Meditate", "Fight", "Quit game"};
        switch (getGame().readUserChoice(options)) {
            case 1:
                this.getGame().setXp(1);
                System.out.println("you trained succesfully");
                if (getGame().getXp() > 30) {
                    getGame().setLevel();
                } else {
                    System.out.println("you need more xp to level up");
                }
                break;
            case 2:
                getGame().setHp(1);
                System.out.println("you succesfully meditated and got more hp");
                break;
            case 3:
                if (getGame().getHp() == 1) {
                    System.out.println("you died");
                } else {
                    getGame().setHp(-1);
                    getGame().setXp(2);
                    if (getGame().getXp() > 30) {
                        getGame().setLevel();
                    } else {
                        System.out.println("you need more xp to level up");
                    }
                }
                break;
            case 4:
                break;
        }
        if (getGame().getLevel() == 4) {
            getGame().setState(new MasterState(this.getGame()));
        }
    }
}