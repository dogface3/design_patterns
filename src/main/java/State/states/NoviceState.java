package State.states;

import State.Game;

public class NoviceState extends State {

    public NoviceState(Game game) {
        super(game);
    }

    public void action() {
        System.out.println("name:" + getGame().getName());
        System.out.println("hp:" + getGame().getHp());
        System.out.println("level:" + getGame().getLevel());
        System.out.println("xp:" + getGame().getXp());

        String[] options = {"Train", "Quit game"};
        switch (getGame().readUserChoice(options)) {
            case 1:
                this.getGame().setXp(1);
                System.out.println("you trained succesfully");
                if (getGame().getXp() > 10) {
                    getGame().setLevel();
                } else {
                    System.out.println("you need more xp to level up");
                }
                break;
            case 2:
                break;
        }
        if (getGame().getLevel() == 2) {
            getGame().setState(new Intermediate(this.getGame()));
        }


    }
}