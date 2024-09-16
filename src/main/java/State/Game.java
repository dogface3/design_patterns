package State;
import State.states.NoviceState;
import State.states.State;
import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);
    private State state;
    String name = "default";
    int xp = 0;
    int hp = 10;
    int level = 1;

    public Game(){
        state = new NoviceState(this);
    }

    public void operate() {
        while (true) {
            if (state == null) {
                // should never happen
                System.out.println("Game out of order");
                return;
            }
            state.action();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public int readUserChoice(String[] options) {
        // print options
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println(i + ". " + options[i-1]);
        }
        // read user input
        return scanner.nextInt();
    }
    public int getHp() {
        return hp;
    }

    public int getXp() {
        return xp;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp += hp;
    }

    public void setXp(int Xp) {
        this.xp = xp + Xp;
    }

    public void setLevel() {
        this.level += 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void resetAll(){
        this.hp = 10;
        this.xp = 0;
        this.level = 1;
    }
}
